package com.liujun.service.impl;

import com.liujun.entity.Teacher;
import com.liujun.entity.User;
import com.liujun.service.ITeacherService;
import com.liujun.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService implements ITeacherService {
    private static final Logger L = LoggerFactory.getLogger(TeacherService.class);
    @Autowired
    private UserService userService;

    @Override
    public  Teacher getTeacher(Integer id) {
        User user = this.userService.getByName("a");

        Teacher teacher = new Teacher();
        teacher.setId(1);
        teacher.setName("teacher");
        teacher.setAge(1);
        teacher.setUser(user);
        return teacher;
    }

}
