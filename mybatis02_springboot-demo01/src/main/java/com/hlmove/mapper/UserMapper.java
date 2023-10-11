package com.hlmove.mapper;

import com.hlmove.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Hlmove
 * @date 创建日期 2023/10/7 16:09
 * @Description com.hlmove.mapper
 * @Note
 */
@Mapper
public interface UserMapper {
    //查询所有用户数据
    @Select("select id, name, age, gender, phone from t_user")
    List<User> list();
}
