package com.hlmove.mybatis04;

import com.hlmove.mybatis04.domian.Category;
import com.hlmove.mybatis04.mapper.CategoryMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CategoryTest {
    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    public void findAll() {
        List<Category> categoryMapperAll = categoryMapper.findAll();
        System.out.println("categoryMapperAll = " + categoryMapperAll);

    }

    @Test
    public void findById(){
        Category byId = categoryMapper.findById(2);
        System.out.println("byId = " + byId);
    }
    @Test
    public void findById2(){
        Category byId = categoryMapper.findById2(2);
        System.out.println("byId = " + byId);
    }
    @Test
    public void findById3(){
        Category byId = categoryMapper.findById3(2);
        System.out.println("byId = " + byId);
    }


}
