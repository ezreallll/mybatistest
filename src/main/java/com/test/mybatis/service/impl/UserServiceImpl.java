package com.test.mybatis.service.impl;

import com.test.mybatis.dao.UserMapper;
import com.test.mybatis.entity.User;
import com.test.mybatis.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by hongpengsun on 16/12/2.
 */

@Service("userService")
public class UserServiceImpl  implements IUserService{


    @Resource
    private UserMapper userMapper;

    public User getUserById(int userId) {
        return this.userMapper.selectByPrimaryKey(userId);
    }

    public void insertUser(User user) {
        this.userMapper.insert(user);
    }
}
