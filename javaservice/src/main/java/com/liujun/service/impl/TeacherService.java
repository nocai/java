package com.liujun.service.impl;

import com.liujun.entity.Student;
import com.liujun.entity.Teacher;
import com.liujun.entity.User;
import com.liujun.service.IStudentService;
import com.liujun.service.ITeacherService;
import com.liujun.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService implements ITeacherService {
    private static final Logger L = LoggerFactory.getLogger(TeacherService.class);
    @Autowired
    private IStudentService studentService;

    @Override
    public Teacher getTeacher(Integer id) {
        return null;
    }

    @Override
    public Teacher getByName(String name) {
        Teacher teacher = new Teacher();
        teacher.setName(name);
        Student student = this.studentService.getByName(name);
        if (student != null) {
            teacher.setStudent(student);
        }
        return teacher;
    }
}
