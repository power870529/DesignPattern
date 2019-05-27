package com.design.pattern.structural.decorator.v1;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-05-09 09:12:04
 */
public class BattercakeWithEggSausage extends BattercakeWithEgg {

    @Override
    public String getDesc() {
        return super.getDesc() + "加一根肠";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.5;
    }
}
