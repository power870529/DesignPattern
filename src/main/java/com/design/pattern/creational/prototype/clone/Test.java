package com.design.pattern.creational.prototype.clone;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-04-02 09:01:50
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date birthday = new Date(0);

        Pig pig1 = new Pig("佩奇", birthday);
        Pig pig2 = (Pig) pig1.clone();

        System.out.println(pig1);
        System.out.println(pig2);

        pig1.getBirthday().setTime(66666666666L);
        System.out.println(pig1);
        System.out.println(pig2);

    }
}
