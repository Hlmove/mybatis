package com.hlmove.mybatis04.mapper.extend;

import com.hlmove.mybatis04.domian.extend.BookExtend;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Hlmove
 * @date 创建日期 2023/10/9 14:08
 * @Description com.hlmove.mybatis04.mapper.extend
 * @Note
 */
@Mapper
public interface BookExtendMapper {
    BookExtend findById01(Integer bid);

    BookExtend findById02(Integer bid);

    BookExtend findById03(Integer bid);
    BookExtend findById04(Integer bid);
    BookExtend findById05(Integer bid);
}