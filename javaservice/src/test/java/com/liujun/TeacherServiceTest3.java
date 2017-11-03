package com.liujun;

import com.liujun.entity.User;
import com.liujun.service.IUserService;
import com.liujun.service.impl.UserServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.test.context.ContextConfiguration;

import java.util.Date;

//@RunWith(value = SpringJUnit4ClassRunner.class)
//@ContextConfigurationiguration(value = {"classpath*:spring-*.xml"})

@RunWith(PowerMockRunner.class)
@ContextConfiguration(value = {"classpath*:spring-*.xml"})
public class TeacherServiceTest3 {
    @Test
    @PrepareForTest(UserServiceImpl.class)
    public void testConditionSuccess() throws Exception {//① 正常流程
        IUserService userService = PowerMockito.spy(new UserServiceImpl());

        User user = new User();
        user.setAge(1);
        user.setBirthday(new Date());
        user.setName("name");
        PowerMockito.doReturn(user).when(userService, "getByAge", 1);

        User user2 = userService.getByName("a");
        Assert.assertEquals(user, user2);
    }


} 