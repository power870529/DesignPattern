package com.design.pattern.creational.abstractfactory;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-03-01 08:54:18
 */
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写 Java 手记");
    }
}
