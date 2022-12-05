package org.example.controller;

import org.example.entity.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @Title: UserController
 * @Author: 刘成龙
 * @Version:1.0
 * @time: 2022/12/04 14:50
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Results login(@RequestBody User user){
        System.out.println(user);
        User user1 = userService.login(user);
        System.out.println(user1);
        if (user1!=null){
            return new Results(Code.LOGIN_OK,"登录成功！");
        }else {
            return new Results(Code.LOGIN_ERROR,"登录失败！");
        }
    }

}
