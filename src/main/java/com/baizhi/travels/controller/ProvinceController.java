package com.baizhi.travels.controller;

import com.baizhi.travels.entity.Province;
import com.baizhi.travels.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("province")
public class ProvinceController {
    @Autowired
    private ProvinceService provinceService;

    /**
     * 查询所有
     */
    @GetMapping("findByPage")
    public Map<String, Object> findByPage(Integer page, Integer rows) {
        page = page == null ? 1 : page;
        rows = rows == null ? 4 : rows;
        HashMap<String, Object> map = new HashMap<>();
        //分页处理
        List<Province> provinces = provinceService.findByPage(page, rows);
        //计算总页数
        Integer totals = provinceService.findTotals();
        Integer totalPage = totals % rows == 0 ? totals / rows : totals / rows + 1;
        map.put("provinces", provinces);
        map.put("totals", totals);
        map.put("totalPage", totalPage);
        map.put("page", page);
        return map;
    }
    /*public Map<String,Object> findAll(){
        HashMap<String,Object> map = new HashMap<>();
        List<Province> provinces = provinceService.findAll();
        Integer totals=provinceService.findTotals();
        map.put("provinces",provinces);
        return map;
    }*/
}
