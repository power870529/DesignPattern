package com.design.pattern.creational.factorymethod;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-02-26 09:02:26
 */
public class Test {

    public static void main(String[] args) {

        VedioFactory vedioFactory = new JavaVedioFactory();
        Vedio vedio = vedioFactory.getVedio();
        vedio.produce();

        vedioFactory = new PythonVedioFactory();
        vedio = vedioFactory.getVedio();
        vedio.produce();

    }
}
