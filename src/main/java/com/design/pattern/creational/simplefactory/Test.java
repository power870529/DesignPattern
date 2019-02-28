package com.design.pattern.creational.simplefactory;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-02-26 09:02:26
 */
public class Test {

    public static void main(String[] args) {

//        v1.0
//        Vedio vedio = new JavaVedio();
//        vedio.produce();
//
//        vedio = new PythonVedio();
//        vedio.produce();

//        v2.0
        VedioFactory factory = new VedioFactory();
        Vedio vedio = factory.getVedio("java");
        if (vedio == null) {
            return;
        }
        vedio.produce();

    }
}
