package com.design.pattern.structural.decorator.v1;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-05-09 09:12:51
 */
public class Test {

    public static void main(String[] args) {

        /**
         * 扩展性不强，每增加一个新的类型都需要新建一个子类，容易发生类爆炸。
         */
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc() + "," + battercake.getPrice());

        Battercake battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getDesc() + "," + battercakeWithEgg.getPrice());

        Battercake BattercakeWithEggSausage = new BattercakeWithEggSausage();
        System.out.println(BattercakeWithEggSausage.getDesc() + "," + BattercakeWithEggSausage.getPrice());
    }
}
