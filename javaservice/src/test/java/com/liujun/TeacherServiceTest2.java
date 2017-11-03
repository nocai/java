package com.liujun;

import base.MockitoBaseTest;
import com.liujun.entity.Student;
import com.liujun.entity.Teacher;
import com.liujun.entity.User;
import com.liujun.service.IStudentService;
import com.liujun.service.ITeacherService;
import com.liujun.service.IUserService;
import com.liujun.service.impl.UserServiceImpl;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Spy;

import javax.annotation.Resource;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doReturn;

public class TeacherServiceTest2 extends MockitoBaseTest {
    private static Logger L = Logger.getLogger(TeacherServiceTest2.class);
    @Resource
    @InjectMocks
    private ITeacherService teacherService;

    @Resource
    @Spy
    @InjectMocks
    private IStudentService studentService;

    @Spy
    @Resource
    private IUserService userService = new UserServiceImpl();

    @Test
    public void testConditionSuccess() {//① 正常流程
        User user = new User();
        user.setName("name");
        doReturn(user).when(this.userService).getByName(anyString());

        Student student = new Student();
        student.setId(1);
//        doReturn(student).when(this.studentService).getById(anyInt());

        Teacher teacher = this.teacherService.getByName(null);
        Assert.assertSame(teacher.getStudent().getUser(), user);

        student = this.studentService.getById(2);
        Assert.assertSame(student.getId(), 2);
    }
}