package com.liujun.service;

import com.liujun.entity.User;

public interface IUserService {
    User getByName(String name);

    User getByNameAndAge(String name, int age);

    User getById(int id);
}
