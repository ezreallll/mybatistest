package com.test.mybatis.service;

import com.test.mybatis.entity.User;

/**
 * Created by hongpengsun on 16/12/2.
 */
public interface IUserService {

    public User getUserById(int userId);

    public void insertUser(User user);
}
