package org.example.service.impl;

import org.example.entity.User;
import org.example.mapper.UserMapper;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @Title: UserServiceImpl
 * @Author: 刘成龙
 * @Version:1.0
 * @time: 2022/12/04 14:55
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(User user) {

        return userMapper.getUser(user);

    }
}
