package com.liujun.mybatis.dao;

import com.liujun.mybatis.entity.Student;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by liujun on 16/11/17.
 */
@Repository
public class StudentDaoImpl implements IStudentDao {
    @Resource
    private SqlSessionTemplate sqlSessionTemplate;
    @Override
    public Student getById(int id) {
        return sqlSessionTemplate.selectOne(this.getClass().getName()+".getById", 1);
    }
}
