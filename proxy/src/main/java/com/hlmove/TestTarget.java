package com.hlmove;

/**
 * @author Hlmove
 * @date 创建日期 2023/10/17 9:18
 * @Description com.hlmove
 * @Note
 */
public class TestTarget {
    public static void main(String[] args) {
        Target target  =  new Target();
        //用代理类增强
        Common proxy  = new Proxy(target);
        proxy.hello();
    }
}
