package com.liujun.service.impl;

import com.liujun.entity.Teacher;
import com.liujun.service.ITeacherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TeacherService implements ITeacherService {
    private static final Logger L = LoggerFactory.getLogger(TeacherService.class);

    @Override
    public  Teacher getTeacher(Integer id) {
        L.info("getTeacher");
        L.warn("getTeacher");
        L.debug("getTeacher");

        if (id > 100) {
            return null;
        }
        Teacher teacher = new Teacher();
        teacher.setAge(1);
        if (id == 1) {
            teacher.setName("有name了");
        }
        return teacher;
    }

}
