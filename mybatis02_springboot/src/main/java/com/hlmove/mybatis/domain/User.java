package com.hlmove.mybatis.domain;

import lombok.Data;

/**
 * @author Hlmove
 * @date 创建日期 2023/10/7 16:07
 * @Description com.hlmove.entity
 * @Note
 */
@Data
public class User {
    private Integer id; //id（主键）
    private String name; //姓名
    private Short age; //年龄
    private Short gender; //性别
    private String phone; //手机号
//省略GET, SET方法
}
