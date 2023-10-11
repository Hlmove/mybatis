package com.hlmove.mybatis04;

import com.hlmove.mybatis04.domian.ShopCar;
import com.hlmove.mybatis04.mapper.ShopCarMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Hlmove
 * @date 创建日期 2023/10/10 12:02
 * @Description com.hlmove.mybatis04
 * @Note
 */
@SpringBootTest
public class ShopCarTest {
    @Autowired
    private ShopCarMapper shopCarMapper;
    @Test
    public void insertShopCarTest(){
        shopCarMapper.insertShopCar(1,2,2);
    }
    @Test
    public void updateShopCarTest(){
        ShopCar shopCar = ShopCar.builder()
                .userId(1)
                .bookId(2)
                .num(10)
                .build();
        shopCarMapper.updateShopCar(shopCar);
    }
    @Test
    public void deleteShopCarTest(){
        shopCarMapper.deleteShopCar(1, 2);
    }
    @Test
    public void clearShopCarTest(){
        shopCarMapper.clearShopCar(1);
    }

}
