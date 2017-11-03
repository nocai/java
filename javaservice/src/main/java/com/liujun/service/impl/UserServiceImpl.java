package com.liujun.service.impl;

import com.liujun.entity.User;
import com.liujun.service.ITeacherService;
import com.liujun.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public User getByName(String name) {
        return this.getByNameAndAge("1",1);
    }

    @Override
    public User getByNameAndAge(String name, int age) {
        return null;
    }

    private User getByAge(int age) {
        return null;
    }
}
