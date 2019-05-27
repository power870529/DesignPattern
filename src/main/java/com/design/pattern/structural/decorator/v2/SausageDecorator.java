package com.design.pattern.structural.decorator.v2;

/**
 * @description: 实体的装饰者类
 * @author: liuzh01
 * @create: 2019-05-09 09:33:21
 */
public class SausageDecorator extends AbstractDecorator {

    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个香肠";
    }

    @Override
    protected double cost() {
        return super.cost() + 1.2;
    }
}
