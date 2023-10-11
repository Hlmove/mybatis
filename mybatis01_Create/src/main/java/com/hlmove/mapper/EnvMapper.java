package com.hlmove.mapper;

import com.hlmove.entity.Env;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Hlmove
 * @date 创建日期 2023/10/7 11:35
 * @Description com.hlmove.mapper
 * @Note
 */
@Mapper
public interface EnvMapper {
    @Select("select * from env_detail_19")
    List<Env> findAll();

}
