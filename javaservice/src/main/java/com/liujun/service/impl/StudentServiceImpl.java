package com.liujun.service.impl;

import com.liujun.entity.Student;
import com.liujun.entity.Teacher;
import com.liujun.entity.User;
import com.liujun.service.IStudentService;
import com.liujun.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by liujun on 11/3/17.
 */

@Service
public class StudentServiceImpl implements IStudentService{
    @Resource
    private IUserService userService;

    @Override
    public Student getByName(String name) {
        Student student = new Student();
        student.setName(name);

        User user = this.userService.getByName(name);
        if (user != null) {
            student.setUser(user);
        }
        return student;
    }

    @Override
    public Student getById(int id) {
        Student student = new Student();
        student.setId(id);

        User user = this.userService.getById(id);
        if (user != null) {
            student.setName(user.getName());
            student.setUser(user);
        }
        return student;
    }
}
