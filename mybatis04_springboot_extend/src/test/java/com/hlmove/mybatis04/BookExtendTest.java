package com.hlmove.mybatis04;

import com.hlmove.mybatis04.domian.extend.BookExtend;
import com.hlmove.mybatis04.mapper.extend.BookExtendMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Hlmove
 * @date 创建日期 2023/10/9 14:17
 * @Description com.hlmove.mybatis04
 * @Note
 */
@SpringBootTest
public class BookExtendTest {
    @Autowired
    private BookExtendMapper bookExtendMapper;
    @Test
    public void findById1(){
        BookExtend byId01 = bookExtendMapper.findById01(1);
        System.out.println("byId01 = " + byId01);
    }
    @Test
    public void findById2(){
        BookExtend byId02 = bookExtendMapper.findById02(1);
        System.out.println("byId02 = " + byId02);
    }
    @Test
    public void findById3(){
        BookExtend byId03 = bookExtendMapper.findById03(1);
        System.out.println("byId03 = " + byId03);
    }
    @Test
    public void findById4(){
        BookExtend byId04 = bookExtendMapper.findById04(1);
        System.out.println("byId04 = " + byId04);
    }
    @Test
    public void findById5() {
        BookExtend byId05 = bookExtendMapper.findById05(1);
        System.out.println("byId05 = "+byId05);
    }

}
