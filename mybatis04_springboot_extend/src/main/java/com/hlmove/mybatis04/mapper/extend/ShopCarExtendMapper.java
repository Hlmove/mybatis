package com.hlmove.mybatis04.mapper.extend;

import com.hlmove.mybatis04.domian.extend.BookShopCarExtend;
import com.hlmove.mybatis04.domian.extend.UserShopCarExtend;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Hlmove
 * @date 创建日期 2023/10/11 14:12
 * @Description com.hlmove.mybatis04.mapper.extend
 * @Note
 */
@Mapper
public interface ShopCarExtendMapper{
    //查询指定用户购物车中所有书籍（含数量）
    List<BookShopCarExtend> findBooksByUserId(Integer userId);
    //嵌套结果映射：查询指定用户信息（含购物车中所有书籍及数量信息）
    UserShopCarExtend findUserByIdResult(Integer userId);

    //嵌套结果查询：查询指定用户信息（含购物车中所有书籍及数量信息）
    UserShopCarExtend findUserByIdSelect(Integer userId);
}
