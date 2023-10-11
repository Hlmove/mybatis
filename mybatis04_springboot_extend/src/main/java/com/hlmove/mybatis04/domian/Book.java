package com.hlmove.mybatis04.domian;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Hlmove
 * @date 创建日期 2023/10/9 14:03
 * @Description com.hlmove.mybatis04.domian
 * @Note
 */
@Data
public class Book implements Serializable {
    private static final long serialVersionUID = -8625803284721820552L;
    private Integer id;
    private String name;
    private String cover;
    private String description;
    private String author;
    private String publisher;
    private Double price;
    private Integer storeNum; //库存数量
    private Integer status; //书籍状态 0：上架 1：下架
    private Integer categoryId; //所属类别id,该值必须为二级分类id
}