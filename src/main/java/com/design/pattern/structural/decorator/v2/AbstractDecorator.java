package com.design.pattern.structural.decorator.v2;

/**
 * @description: 抽象的装饰者类
 * @author: liuzh01
 * @create: 2019-05-09 09:28:33
 */
public abstract class AbstractDecorator extends ABattercake{

    ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    @Override
    protected String getDesc() {
        return this.aBattercake.getDesc();
    }

    @Override
    protected double cost() {
        return this.aBattercake.cost();
    }

    protected abstract void doSomething();
}
