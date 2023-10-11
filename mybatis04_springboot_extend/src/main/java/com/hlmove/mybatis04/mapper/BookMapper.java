package com.hlmove.mybatis04.mapper;

import com.hlmove.mybatis04.domian.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Hlmove
 * @date 创建日期 2023/10/9 14:05
 * @Description com.hlmove.mybatis04.mapper
 * @Note
 */
@Mapper
public interface BookMapper {
    List<Book> findAll();
}
