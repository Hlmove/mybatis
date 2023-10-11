package com.hlmove.mybatis04.domian;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Hlmove
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -6193941247563610261L;
    private Integer id;
    private String username;
    private String password;
    private String phone;
    private String avatar;
    private String gender;
    private Integer status;             //用户状态(0正常，1禁用)
    private LocalDate birthday;
    private LocalDateTime registerTime; //注册时间
}
