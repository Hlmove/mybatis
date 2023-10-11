package com.hlmove.mybatis04.domian;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Hlmove
 */ //购物车基础类，对应es_shopcar表
@Data
@Builder
public class ShopCar implements Serializable {
    private static final long serialVersionUID = -386365301814535132L;
    private Integer id;
    private Integer userId;
    private Integer bookId;
    private Integer num;
}
