package com.design.pattern.structural.decorator.v2;

/**
 * @description: 实体的装饰者类
 * @author: liuzh01
 * @create: 2019-05-09 09:31:26
 */
public class EggDecorator extends AbstractDecorator {

    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    protected double cost() {
        return super.cost() + 1;
    }
}
