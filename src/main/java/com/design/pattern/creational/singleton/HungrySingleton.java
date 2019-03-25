package com.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-03-12 09:15:46
 */
public class HungrySingleton implements Serializable {

    private HungrySingleton() {
    }

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    private Object readResolve() {
        return hungrySingleton;
    }
}
