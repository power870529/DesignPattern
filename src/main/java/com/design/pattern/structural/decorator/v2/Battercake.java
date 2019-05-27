package com.design.pattern.structural.decorator.v2;

/**
 * @description: 被装饰者的具体实现类
 * @author: liuzh01
 * @create: 2019-05-09 09:27:34
 */
public class Battercake extends ABattercake {

    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected double cost() {
        return 8.0;
    }
}
