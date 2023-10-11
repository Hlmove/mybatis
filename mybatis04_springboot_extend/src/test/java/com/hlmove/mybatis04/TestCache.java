package com.hlmove.mybatis04;

import com.hlmove.mybatis04.domian.Book;
import com.hlmove.mybatis04.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author Hlmove
 * @date 创建日期 2023/10/9 14:13
 * @Description com.hlmove.mybatis04
 * @Note
 */
@SpringBootTest
public class TestCache {
    @Autowired
    private BookMapper bookMapper;
    @Test
    public void findAll(){
        List<Book> all = bookMapper.findAll();
        System.out.println("all = " + all);
        List<Book> all2 = bookMapper.findAll();
        System.out.println("all2 = " + all2);
        List<Book> all3 = bookMapper.findAll();
        System.out.println("all3 = " + all3);
        List<Book> all4 = bookMapper.findAll();
        System.out.println("all4 = " + all4);
    }
}
