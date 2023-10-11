package com.hlmove.mybatis04.domian;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Hlmove
 * @date 创建日期 2023/10/9 11:40
 * @Description com.hlmove.mybatis04.domian
 * @Note
 */
//图书类别，可以是表示一级分类，也可以表示二级分类
@Data
public class Category implements Serializable {
    private static final long serialVersionUID = 1326482894203351876L;
    private Integer id;
    private String name;
    private String description;
    private Integer parentId; //父类别id


}
