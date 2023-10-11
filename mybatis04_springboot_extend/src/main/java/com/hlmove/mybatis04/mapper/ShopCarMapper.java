package com.hlmove.mybatis04.mapper;

import com.hlmove.mybatis04.domian.ShopCar;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Hlmove
 * @date 创建日期 2023/10/10 11:56
 * @Description com.hlmove.mybatis04.mapper
 * @Note
 */
@Mapper
public interface ShopCarMapper {
    //指定用户往购物车添加书籍
    void insertShopCar(Integer userId, Integer bookId, Integer num);
    //指定用户修改购物车书籍数量
    void updateShopCar(ShopCar shopCar);
    //删除指定用户购物车中某本书籍
    void deleteShopCar(Integer userId, Integer bookId);
    //清空指定用户购物车
    void clearShopCar(Integer userId);

}
