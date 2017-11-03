package com.liujun.service;

import com.liujun.entity.Student;

/**
 * Created by liujun on 11/3/17.
 */
public interface IStudentService {
    Student getByName(String name);

    Student getById(int id);
}
