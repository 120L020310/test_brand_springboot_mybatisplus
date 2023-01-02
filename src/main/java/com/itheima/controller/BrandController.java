package com.itheima.controller;

import com.itheima.domain.Brand;
import com.itheima.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brands")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @PostMapping
    public Result save(@RequestBody Brand brand) {
        boolean flag = brandService.save(brand);
        return new Result(flag ? Code.SAVE_OK:Code.SAVE_ERR,flag);
    }

    @PutMapping
    public Result update(@RequestBody Brand brand) {
        boolean flag = brandService.update(brand);
        return new Result(flag ? Code.UPDATE_OK:Code.UPDATE_ERR,flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = brandService.delete(id);
        return new Result(flag ? Code.DELETE_OK:Code.DELETE_ERR,flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Brand brand = brandService.getById(id);
        Integer code = brand != null ? Code.GET_OK : Code.GET_ERR;
        String msg = brand != null ? "" : "数据查询失败，请重试！";
        return new Result(code,brand,msg);
    }

    @GetMapping
    public Result getAll() {
        List<Brand> brandList = brandService.getAll();
        Integer code = brandList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = brandList != null ? "" : "数据查询失败，请重试！";
        return new Result(code,brandList,msg);
    }
    @GetMapping
    public String receive() {
        return "receive success!";
    }
    @GetMapping
    public String send(){
        return "send success!";
    }
}
