package com.design.pattern.creational.singleton;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-03-08 08:55:24
 */
public class LazySingleton {

    private LazySingleton() {

    }

    private static LazySingleton instance = null;

//    v1.0
//    public static LazySingleton getInstance() {
//        if (instance == null) {
//            instance = new LazySingleton();
//        }
//        return instance;
//    }

//    v2.0
    public synchronized static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
