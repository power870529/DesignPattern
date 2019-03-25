package com.design.pattern.creational.singleton;

import java.io.*;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-03-08 09:04:29
 */
public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Thread t1 = new Thread(new T());
//        Thread t2 = new Thread(new T());
//
//        t1.start();
//        t2.start();
//        System.out.println("program end!!!");

        // 序列化和反序列化破坏单例模式
        HungrySingleton instance = HungrySingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        HungrySingleton newInstance = (HungrySingleton) ois.readObject();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}
