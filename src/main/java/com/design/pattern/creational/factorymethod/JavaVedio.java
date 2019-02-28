package com.design.pattern.creational.factorymethod;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-02-26 09:00:57
 */
public class JavaVedio extends Vedio {
    @Override
    void produce() {
        System.out.println("录制 Java 课程");
    }
}
