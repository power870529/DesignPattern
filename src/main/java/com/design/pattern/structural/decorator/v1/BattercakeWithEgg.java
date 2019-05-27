package com.design.pattern.structural.decorator.v1;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-05-09 09:11:10
 */
public class BattercakeWithEgg extends Battercake {

    @Override
    public String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1;
    }
}
