package com.liujun.mybatis.dao;

import org.mybatis.spring.annotation.MapperScan;

import com.liujun.mybatis.entity.Student;

/**
 * Created by liujun on 16/11/17.
 */
@MapperScan
public interface IStudentDao {
    public Student getById(int id);
}
