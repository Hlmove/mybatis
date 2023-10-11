package com.hlmove.mybatis04;

import com.hlmove.mybatis04.domian.extend.CategoryExtend;
import com.hlmove.mybatis04.mapper.extend.CategoryExtendMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Hlmove
 * @date 创建日期 2023/10/9 18:37
 * @Description com.hlmove.mybatis04
 * @Note
 */
@SpringBootTest
public class CategoryExtendTest {
    @Autowired
    private CategoryExtendMapper categoryExtendMapper;

    @Test
    public void test_findByIdWithResult() {
        CategoryExtend categoryExtend =
                categoryExtendMapper.findByIdWithResult(1);
        System.out.println(categoryExtend);
    }

    @Test
    public void test_findByIdWithSelect() {
        CategoryExtend categoryExtend =
                categoryExtendMapper.findByIdWithSelect(1);
        System.out.println(categoryExtend);
    }
}
