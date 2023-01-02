package com.itheima.service;

import com.itheima.domain.Brand;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BrandService {

    /**
     * 保存
     * @param brand
     * @return
     */
    public boolean save(Brand brand);

    /**
     * 修改
     * @param brand
     * @return
     */
    public boolean update(Brand brand);

    /**
     * 按id删除
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 按id查询
     * @param id
     * @return
     */
    public Brand getById(Integer id);

    /**
     * 查询全部
     * @return
     */
    public List<Brand> getAll();
}
