package com.hlmove.mybatis04.domian.extend;


import com.hlmove.mybatis04.domian.User;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
/**
 * @author Hlmove
 * @date 创建日期  2023/10/10 10:13
 * @Description com.hlmove.mybatis04.domian.extend
 * @Note 该类中记录用户购物车信息（包含所有书籍及对应的数量）
 */
@Setter
@Getter
public class UserShopCarExtend extends User implements Serializable {
    private static final long serialVersionUID = -6059389796163023123L;
    // 用户购物车中包含多本书籍（含数量）
    private List<BookShopCarExtend> books;

    @Override
    public String toString() {
        return "UserShopCarExtend{id=" +
                super.getId() + ", username=" +
                super.getUsername() + ", phone=" +
                super.getPhone() +
                ", books=" + books +
                '}';
    }
}
