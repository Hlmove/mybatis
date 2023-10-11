package com.hlmove.mybatis04.domian.extend;

import com.hlmove.mybatis04.domian.Book;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Hlmove
 * @date 创建日期  2023/10/10 10:13
 * @Description com.hlmove.mybatis04.domian.extend
 * @Note 书籍基本信息 + 用户购物车中该书籍的数量
 */
@Setter
@Getter
public class BookShopCarExtend extends Book implements Serializable {
    private static final long serialVersionUID = 5805006267002727503L;
    // 用户购物车中，指定id书籍的数量
    private Integer num;

    @Override
    public String toString() {
        return "BookShopCarExtend{id=" +
                super.getId() + ", name=" +
                super.getName() + ", description=" +
                super.getDescription() + ", price=" +
                super.getPrice() + ", status=" +
                super.getStatus() + ", num=" + num +
                '}';
    }
}
