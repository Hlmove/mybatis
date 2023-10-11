package com.hlmove.mybatis04.mapper;

import com.hlmove.mybatis04.domian.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Hlmove
 * @date 创建日期 2023/10/9 11:40
 * @Description com.hlmove.mybatis04.mapper
 * @Note
 */
@Mapper
public interface CategoryMapper {
    List<Category> findAll();
    Category findById(Integer id);

    Category findById2(Integer cid);
    Category findById3(Integer cid);

    List<Category> findAllByParentId(Integer id);
}
