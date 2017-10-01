package com.liujun;

import com.liujun.entity.Teacher;
import com.liujun.service.ITeacherService;
import com.liujun.util.BeanValidatorUtils;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.validation.ConstraintViolationException;
import java.util.Map;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath*:spring-*.xml"})
public class TeacherServiceTest {
    private static Logger L = Logger.getLogger(TeacherServiceTest.class);
    @Resource
    private ITeacherService teacherService;

    @Test
    public void testConditionSuccess() {//① 正常流程
        Teacher teacher = teacherService.getTeacher(1);
        L.error(teacher);
    }

    @Test
    public void testPreCondtionFail() { //②错误的uuid(即前置条件不满足)
        try {
            teacherService.getTeacher(0);
        } catch (ConstraintViolationException e) {
            Map<String, String> stringStringMap = BeanValidatorUtils.extractPropertyAndMessage(e);
            System.out.println(stringStringMap);
            Assert.assertEquals(stringStringMap.get("getTeacher.arg0"), "最小不能小于1");
        }
    }

    @Test
    public void testPostCondtionFail() { //③不满足后置条件的返回值
        try {
            teacherService.getTeacher(10000);
        } catch (ConstraintViolationException e) {
            Map<String, String> stringStringMap = BeanValidatorUtils.extractPropertyAndMessage(e);
            System.out.println(stringStringMap);
            Assert.assertEquals(stringStringMap.get("getTeacher.<return value>"), "不能为null");
        }
    }
} 