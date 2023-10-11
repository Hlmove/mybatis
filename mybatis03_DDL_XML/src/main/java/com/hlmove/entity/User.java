package com.hlmove.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Hlmove
 * @date 创建日期 2023/10/7 16:07
 * @Description com.hlmove.entity
 * @Note
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User implements Serializable {

    private static final long serialVersionUID = -4402504655927979615L;
    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 登录用户名
     */
    private String username;
    /**
     * 登录密码
     */
    private String password;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 用户头像
     */
    private String avatar;
    /**
     * 用户性别(0男，1女)
     */
    private String gender;
    /**
     * 用户状态(0正常，1禁用)
     */
    private Byte status;
    /**
     * 用户生日
     */
    private LocalDate birthday;
    /**
     * 注册时间
     */
    private LocalDateTime registerTime;

}