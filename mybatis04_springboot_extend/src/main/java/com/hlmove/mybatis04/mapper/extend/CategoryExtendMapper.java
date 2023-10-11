package com.hlmove.mybatis04.mapper.extend;

import com.hlmove.mybatis04.domian.extend.CategoryExtend;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Hlmove
 * @date 创建日期 2023/10/9 15:26
 * @Description com.hlmove.mybatis04.mapper.extend
 * @Note
 */
@Mapper
public interface CategoryExtendMapper {
    //查询指定的图书类别，如果是1级分类要求包含所有2级分类
    CategoryExtend findByIdWithResult(Integer cid);
    CategoryExtend findByIdWithSelect(Integer cid);
}