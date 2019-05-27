package com.design.pattern.structural.decorator.v2;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-05-09 09:34:30
 */
public class Test {

    public static void main(String[] args) {

        ABattercake aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);

        System.out.println(aBattercake.getDesc() + ", " + aBattercake.cost());
    }
}
