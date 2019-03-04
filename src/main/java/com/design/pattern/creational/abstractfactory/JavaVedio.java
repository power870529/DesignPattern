package com.design.pattern.creational.abstractfactory;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-03-01 08:52:39
 */
public class JavaVedio extends Vedio {

    @Override
    public void produce() {
        System.out.println("录制 Java 课程");
    }
}
