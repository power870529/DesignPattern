package com.design.pattern.creational.abstractfactory;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-03-01 08:53:32
 */
public class PythonVedio extends Vedio {

    @Override
    public void produce() {
        System.out.println("录制 Python 课程");
    }
}
