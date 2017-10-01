package com.liujun.hystrix;

import com.liujun.entity.Teacher;
import com.liujun.service.ITeacherService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.concurrent.CountDownLatch;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath*:spring-*.xml"})
public class TeacherCommandTest implements BeanFactoryAware {
    @Resource
    private ITeacherService teacherService;

    private BeanFactory beanFactory;

    @Test
    public void testGetBean() {
        Assert.assertTrue(beanFactory.isPrototype("teacherCommand"));
    }
    @Test
    public void testGetBean2() {
        Assert.assertTrue(beanFactory.isSingleton("teacherService"));
    }
    @Test
    public void testGetTeacher() throws InterruptedException {
        final CountDownLatch latch = new CountDownLatch(100);
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(Thread.currentThread().getName());
                        Teacher teacher = ((TeacherCommand) beanFactory.getBean("teacherCommand")).execute();
//            Teacher teacher = teacherService.getTeacher(1);
                        Assert.assertNotNull(teacher);
                    } finally {
                        latch.countDown();
                    }

                }
            }).start();
        }
        System.out.println("end");
        latch.await();
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }
}
