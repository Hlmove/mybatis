package com.hlmove.mybatis04.domian.extend;

import com.hlmove.mybatis04.domian.Book;
import com.hlmove.mybatis04.domian.Category;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Hlmove
 * @date 创建日期 2023/10/9 14:07
 * @Description com.hlmove.mybatis04.domian.extend
 * @Note
 */
//表示图书（含二级分类）
@Getter
@Setter
public class BookExtend extends Book implements Serializable {
    private static final long serialVersionUID = 9114995133511759893L;
    // 该书籍所在的类别(二级分类)
    private Category category;
    @Override
    public String toString() {
        String str = super.toString();
        return str + ": " + category.toString();
    }
}