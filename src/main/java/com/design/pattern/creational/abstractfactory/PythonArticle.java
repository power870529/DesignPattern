package com.design.pattern.creational.abstractfactory;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-03-01 08:55:07
 */
public class PythonArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写 Python 手记");
    }
}
