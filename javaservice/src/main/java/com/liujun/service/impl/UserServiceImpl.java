package com.liujun.service.impl;

import com.liujun.entity.User;
import com.liujun.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Override
    public User getByName(String name) {
        User user = new User();
        user.setName(name);
        return user;
    }

    @Override
    public User getByNameAndAge(String name, int age) {
        return null;
    }

    private User getByAge(int age) {
        return null;
    }

    @Override
    public User getById(int id) {
        User user = new User();
        user.setId(id);
        return user;
    }
}
