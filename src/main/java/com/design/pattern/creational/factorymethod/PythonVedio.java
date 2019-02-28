package com.design.pattern.creational.factorymethod;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-02-26 09:01:49
 */
public class PythonVedio extends Vedio {
    @Override
    void produce() {
        System.out.println("录制 Python 课程");
    }
}
