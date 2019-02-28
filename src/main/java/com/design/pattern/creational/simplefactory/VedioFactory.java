package com.design.pattern.creational.simplefactory;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-02-26 09:10:23
 */
public class VedioFactory {

    public Vedio getVedio(String type) {
        if (type.equalsIgnoreCase("java")) {
            return new JavaVedio();
        } else if (type.equalsIgnoreCase("python")) {
            return new PythonVedio();
        }

        return null;
    }

}
