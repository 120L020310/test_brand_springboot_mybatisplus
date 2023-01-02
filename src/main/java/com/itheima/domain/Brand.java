package com.itheima.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tb_brand")
public class Brand {
    private Integer id;
    private String brandname;
    private String companyname;
    private String description;
}
