package com.itheima.service.impl;

import com.itheima.controller.Code;
import com.itheima.dao.BrandDao;
import com.itheima.domain.Brand;
import com.itheima.exception.BusinessException;
import com.itheima.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandDao brandDao;

    public boolean save(Brand brand) {
        return brandDao.insert(brand) > 0;
    }

    public boolean update(Brand brand) {
        return brandDao.updateById(brand) > 0;
    }

    public boolean delete(Integer id) {
        return brandDao.deleteById(id) > 0;
    }

    public Brand getById(Integer id) {
        if(id == 1){
            throw new BusinessException(Code.BUSINESS_ERR,"请不要使用你的技术挑战我的耐性!");
        }
        return brandDao.selectById(id);
    }

    public List<Brand> getAll() {
        return brandDao.selectList(null);
    }
}
