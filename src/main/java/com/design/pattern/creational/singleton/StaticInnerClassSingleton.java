package com.design.pattern.creational.singleton;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-03-12 09:01:32
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
    }

    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    /*
    以下5种情况首次发生时，类A（这里的类包括接口）将立即被初始化：
        1.创建一个A类型的实例；
        2.A类中声名的一个静态方法被调用；
        3.A类中声名的一个静态成员被赋值；
        4.A类中声名的一个静态成员被使用，并且该成员不是一个常量；（本例符合这种情况）
        5.如何A类是一个顶级类，并且A类中有嵌套的断言语句。
     */
    public StaticInnerClassSingleton getInstance() {
        /*
         InnerClass 的静态成员首次被使用，使得InnerClass立即被初始化；
         初始化时，由于初始化锁的存在，其他线程看不到初始化过程中的指令重排序
        */

        return InnerClass.staticInnerClassSingleton;
    }
}
