package com.baizhi.travels.service;

import com.baizhi.travels.entity.Province;

import java.util.List;

public interface ProvinceService {
    //参数一当前页  参数二每页显示的记录数
    List<Province> findByPage(Integer page,Integer rows);
    //查询总条数
    Integer findTotals();
    List<Province> findAll();





}
