package com.baizhi;


import com.baizhi.travels.entity.Province;
import com.baizhi.travels.service.ProvinceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = TravelsApplication.class)

public class TestProvinceService {
    @Autowired
    private ProvinceService provinceService;
    @Test
    public void testFindByPage(){
        List<Province> list = provinceService.findByPage(1, 5);
        list.forEach(province -> {
            System.out.println(province);
        });
    }


}
