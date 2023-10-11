package com.hlmove.mybatis04.domian.extend;

import com.hlmove.mybatis04.domian.Category;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * @author Hlmove
 * @date 创建日期 2023/10/9 15:26
 * @Description com.hlmove.mybatis04.domian.extend
 * @Note
 */
@Getter
@Setter
public class CategoryExtend extends Category  implements Serializable {
    private static final long serialVersionUID = 6515028522858181852L;
    //一级分类中要包含所有的子类别(二级分类)
    private List<Category> categories;
    @Override
    public String toString() {
        return "CategoryExtend{id=" +
                super.getId() + ", name=" +
                super.getName() + ", description=" +
                super.getDescription() + ", parent_id=" +
                super.getParentId() + ", categories=" +
                categories + "}";
    }
}
