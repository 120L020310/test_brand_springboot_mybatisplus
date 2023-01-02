package com.itheima.service;

import com.itheima.domain.Brand;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class BrandServiceTest {

    @Autowired
    private BrandService brandService;

    @Test
    public void testGetById(){
        Brand brand = brandService.getById(2);
        System.out.println(brand);
    }

    @Test
    public void testGetAll(){
        List<Brand> all = brandService.getAll();
        System.out.println(all);
    }

}
