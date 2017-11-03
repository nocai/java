package base;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import base.util.AopTargetUtils;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

public class MockitoDependencyInjectionTestExecutionListener extends DependencyInjectionTestExecutionListener {
    private static final Map<String, MockObject> mockObject = new HashMap<String, MockObject>();
    private static final List<Object> injectFields = new ArrayList<Object>();
    private static final List<Object> springInjectFields = new ArrayList<Object>();

    @Override
    protected void injectDependencies(TestContext testContext) throws Exception {
        // 防止多个单元测试打包测试的时候相互干扰
        mockObject.clear();
        injectFields.clear();
        springInjectFields.clear();
        super.injectDependencies(testContext);
        init(testContext);
    }

    @SuppressWarnings("rawtypes")
    private void init(final TestContext testContext) throws Exception {
        AutowireCapableBeanFactory beanFactory = testContext
                .getApplicationContext().getAutowireCapableBeanFactory();
        Object bean = testContext.getTestInstance();
        Field[] fields = bean.getClass().getDeclaredFields();

        for (Field field : fields) {
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof Mock) {
                    MockObject obj = new MockObject();
                    obj.setType(field.getType());
                    obj.setObj(Mockito.mock(field.getType()));
                    field.setAccessible(true);
                    field.set(bean, obj.getObj());
                    mockObject.put(field.getName(), obj);
                } else if (annotation instanceof Spy) {
                    // 用spy方法构建spring管理的service对应的真实对象
                    // @Spy注解需要和@Autowired或@Resource配合使用
                    MockObject obj = new MockObject();
                    field.setAccessible(true);
                    obj.setType(field.getType());
                    obj.setObj(Mockito.spy(AopTargetUtils.getTarget(field.get(bean))));
                    field.set(bean, obj.getObj());
                    mockObject.put(field.getName(), obj);
                }
//                else if (annotation instanceof TestService) {
//                    field.setAccessible(true);
//                    Object obj = field.getType().newInstance();
//                    field.set(bean, obj);
//                    injectFields.add(obj);
//                }
                else if (annotation instanceof Autowired || annotation instanceof Resource) {
                    // 记录spring注入的对象
                    springInjectFields.add(field);
                }
            }
        }

        for (Object obj : injectFields) {
            try {
                Class destClazz = obj.getClass();

                Field[] destFields = destClazz.getDeclaredFields();
                for (Annotation annotation : destClazz.getDeclaredAnnotations()) {
                    Class clazz = annotation.annotationType();
                    System.out.println(clazz.getName());
                }

                for (Field deField : destFields) {
                    System.out.println(deField.getName());
                }
                for (Field destField : destFields) {

                    MockObject mockObj = mockObject.get(destField.getName());

                    if (mockObj != null) {
                        destField.setAccessible(true);
                        destField.set(obj, mockObj.getObj());
                    } else {
                        Annotation[] annotations = destField.getAnnotations();
                        for (Annotation annotation : annotations) {
                            if (annotation instanceof Autowired
                                    || annotation instanceof Resource) {
                                destField.setAccessible(true);
                                Object o = beanFactory.getBean(
                                        destField.getName(),
                                        destField.getType());
                                destField.set(obj, o);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // 将模拟的对象注入Spring管理的对象中
        for (Object obj : springInjectFields) {
            try {
                Class destClazz;
                Field field = (Field) obj;
                field.setAccessible(true);
                Object object = field.get(bean);
                // 如果是Spring代理的话，找到真正的对象
                destClazz = AopUtils.getTargetClass(object);
                if (destClazz == null) {
                    // 可能是远程实现
                    continue;
                }
                for (Field destField : destClazz.getDeclaredFields()) {

                    MockObject mockObj = mockObject.get(destField.getName());
                    if (null != mockObj) {
                        destField.setAccessible(true);
                        destField.set(AopTargetUtils.getTarget(object),
                                mockObj.getObj());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class MockObject {
        private Class<?> type;
        private Object obj;

        public Class<?> getType() {
            return type;
        }

        public void setType(Class<?> type) {
            this.type = type;
        }

        public Object getObj() {
            return obj;
        }

        public void setObj(Object obj) {
            this.obj = obj;
        }
    }
}


