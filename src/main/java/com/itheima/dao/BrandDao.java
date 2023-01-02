package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.Brand;
import org.apache.ibatis.annotations.*;

import java.util.List;

// TODO 添加@Mapper
@Mapper
public interface BrandDao extends BaseMapper<Brand> {
//    @Insert("insert into tb_brand (brand_name,company_name,description) values(#{brand_name},#{company_name},#{description})")
//    public int save(Brand brand);
//
//    @Update("update tb_brand set brand_name = #{brand_name}, company_name = #{company_name}, description = #{description} where id = #{id}")
//    public int update(Brand brand);
//
//    @Delete("delete from tb_brand where id = #{id}")
//    public int delete(Integer id);
//
//    @Select("select * from tb_brand where id = #{id}")
//    public Brand getById(Integer id);
//
//    @Select("select * from tb_brand")
//    public List<Brand> getAll();
}
