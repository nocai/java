package com.liujun.service;

import com.liujun.entity.User;

public interface UserService {
    User getByName(String name);

    User getByNameAndAge(String name, int age);
}
