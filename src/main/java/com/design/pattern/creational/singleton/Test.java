package com.design.pattern.creational.singleton;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-03-08 09:04:29
 */
public class Test {

    public static void main(String[] args) {
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());

        t1.start();
        t2.start();
        System.out.println("program end!!!");
    }
}
