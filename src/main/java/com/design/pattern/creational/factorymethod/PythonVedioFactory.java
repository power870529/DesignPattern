package com.design.pattern.creational.factorymethod;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-02-27 08:59:41
 */
public class PythonVedioFactory extends VedioFactory {

    @Override
    public Vedio getVedio() {
        return new PythonVedio();
    }
}
