package com.liujun;

import base.MockitoBaseTest;
import com.liujun.entity.Teacher;
import com.liujun.entity.User;
import com.liujun.service.ITeacherService;
import com.liujun.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doReturn;

public class TeacherServiceTest2 extends MockitoBaseTest {
    private static Logger L = Logger.getLogger(TeacherServiceTest2.class);
    @Autowired
    private ITeacherService teacherService;
    //    @Mock
    @Autowired
    @Spy
    private UserService userService;

    @Test
    public void testConditionSuccess() {//① 正常流程
        User user = new User();
        user.setAge(1);
        user.setBirthday(new Date());
        user.setName("name");
//        when(userService.getByName(anyString())).thenReturn(user);
        doReturn(user).when(this.userService).getByNameAndAge(anyString(), anyInt());


        Teacher teacher = this.teacherService.getTeacher(1);
        Assert.assertTrue(teacher.getUser() == user);
    }
}