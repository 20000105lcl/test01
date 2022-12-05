package org.example.mapper;

import org.apache.ibatis.annotations.Select;
import org.example.entity.User;

/**
 * @description:
 * @Title: UserMapper
 * @Author: 刘成龙
 * @Version:1.0
 * @time: 2022/12/04 14:55
 */
public interface UserMapper {

    @Select("select * from user where username=#{username} and password=#{password}")
    User getUser(User user);

}
