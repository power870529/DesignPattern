package com.design.pattern.creational.singleton;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-03-12 08:32:21
 */
public class LazyDoubleCheckSingleton {

    private LazyDoubleCheckSingleton() {
    }

//    private static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
    // volatile 关键字可以禁止new LazyDoubleCheckSingleton() 时候的指令重排序。
    private static volatile LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }

        return lazyDoubleCheckSingleton;
    }
}
