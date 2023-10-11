package com.hlmove.mybatis04;

import com.hlmove.mybatis04.domian.extend.BookShopCarExtend;
import com.hlmove.mybatis04.domian.extend.UserShopCarExtend;
import com.hlmove.mybatis04.mapper.extend.ShopCarExtendMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author Hlmove
 * @date 创建日期 2023/10/11 14:13
 * @Description com.hlmove.mybatis04
 * @Note
 */
@SpringBootTest
public class UserShopCarExtendTest {
    @Autowired
    private ShopCarExtendMapper shopCarExtendMapper;
    @Test
    public void findBooksByUserIdTest(){
        List<BookShopCarExtend> booksByUserId = shopCarExtendMapper.findBooksByUserId(2);
        System.out.println("booksByUserId = " + booksByUserId);
    }

    @Test
    public void findUserByIdResultTest(){
        UserShopCarExtend userByIdResult = shopCarExtendMapper.findUserByIdResult(2);
        System.out.println("userByIdResult = " + userByIdResult);
    }
    @Test
    public void findUserByIdSelectTest(){
        UserShopCarExtend userByIdSelect = shopCarExtendMapper.findUserByIdSelect(2);
        System.out.println("userByIdSelect = " + userByIdSelect);
    }
}
