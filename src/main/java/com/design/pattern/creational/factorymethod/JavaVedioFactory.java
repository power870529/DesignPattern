package com.design.pattern.creational.factorymethod;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-02-27 08:58:47
 */
public class JavaVedioFactory extends VedioFactory {

    @Override
    public Vedio getVedio() {
        return new JavaVedio();
    }
}
