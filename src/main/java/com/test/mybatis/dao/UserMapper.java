package com.test.mybatis.dao;


import com.test.mybatis.entity.User;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;


public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(int id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}