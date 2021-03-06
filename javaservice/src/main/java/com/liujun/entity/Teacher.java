package com.liujun.entity;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

public class Teacher {
    private int id;
    @NotNull(message = "{teacher.name.error}")
    private String name;
    @Range(min = 1, max = 150, message = "{teacher.age.error}")
    private int age;

    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name=" + name +
                ", age=" + age +
                '}';
    }
}
