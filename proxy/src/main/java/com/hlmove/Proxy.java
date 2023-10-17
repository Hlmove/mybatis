package com.hlmove;

/**
 * @author Hlmove
 * @date 创建日期 2023/10/17 9:19
 * @Description com.hlmove
 * @Note
 */
public class Proxy implements Common {
    private final Target target;

    public Proxy(Target target) {
        this.target = target;
    }

    @Override
    public void hello() {
        //执行源对象的方法
        target.hello();
        //再增强方法
        System.out.println("增强方法");
    }

    public void hello1() {

    }
}
