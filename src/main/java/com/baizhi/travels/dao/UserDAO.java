package com.baizhi.travels.dao;

import com.baizhi.travels.entity.Province;
import com.baizhi.travels.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDAO {
    //根据用户名查询用户
    User findByUsername(String username);
    //注册用户
    void save(User user);
    List<Province> findAll();
}
