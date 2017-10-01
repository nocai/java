package com.liujun.mybatis.entity;

import java.io.Reader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import org.junit.Test;

/**
 * Created by liujun on 16/11/3.
 */
public class StudentDaoTest {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;

    static {
        try {
            reader = Resources.getResourceAsReader("Configure.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSession() {
        return sqlSessionFactory.openSession();
    }


    @Test
    public void testInsert() {
        SqlSession session = getSession();
        try {
            Student student = new Student();
            student.setAge(11111);

            session.insert("com.liujun.mybatis.dao.StudentDaoImpl.insert", student);
            session.commit();
        } finally {
            session.close();
        }
    }

    @Test
    public void testInsertBatch() {
        SqlSession session = getSession();
        try {
            List<Student> studentList = Arrays.asList(new Student[] {new Student("a"), new Student("b"), new Student("c")});

            int count = session.insert("com.liujun.mybatis.dao.StudentDaoImpl.insertBatch", studentList);
            session.commit();
            for (Student student : studentList) {
                System.out.println(student);
            }

            System.out.println(count);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            session.close();

        }
    }

    @Test
    public void testFindAll() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            List<Student> list = session.selectList("com.liujun.mybatis.entity.StudentMapper.findAll");
            for (Student stu : list) {
                System.out.println(stu);
            }
        } finally {
            session.close();
        }
    }

    @Test
    public void testSelectById() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            Student student = session.selectOne("com.liujun.mybatis.dao.StudentDaoImpl.selectById", 2);
            System.out.println(student);
        } finally {
            session.close();
        }
    }

    @Test
    public void testSelectMap() {
        SqlSession session = getSession();
        try {
            Map<String, Object> map = session.selectMap("com.liujun.mybatis.dao.StudentDaoImpl.selectMap", "1");
            System.out.println(map);
        } finally {
            session.close();
        }
    }

    @Test
    public void testFindByName() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            List<Student> stuList = session.selectList("com.liujun.mybatis.entity.StudentMapper.findByName", "abcfdafkdsa");
            System.out.println(stuList.size());
            for (Student stu : stuList) {
                System.out.println(stu);
            }
        } finally {
            session.close();
        }
    }

    @Test
    public void testSelect() {
        SqlSession session = getSession();
        session.select("com.liujun.mybatis.dao.StudentDaoImpl.selectById", 1, new ResultHandler() {
            @Override
            public void handleResult(ResultContext resultContext) {
                Object resultObject = resultContext.getResultObject();
                System.out.println(resultContext);
            }
        });

    }

    @Test
    public void testSelectByNameAndAge() {
//        String name = "a";
//        int age = 1;
//
//        SqlSession session = sqlSessionFactory.openSession();
//        try {
//            List<Student> stuList = session.selectList("com.liujun.mybatis.dao.StudentDaoImpl.selectByNameAndAge", name, age);
//            System.out.println(stuList.size());
//            for (Student stu : stuList) {
//                System.out.println(stu);
//            }
//        } finally {
//            session.close();
//        }
    }
}
