package com.design.pattern.creational.prototype;

import lombok.Data;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-04-02 08:33:19
 */
@Data
public class Mail implements Cloneable{

    private String name;

    private String emailAddress;

    private String content;

    public Mail() {
        System.out.println("Mail Class Coonstructor");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("Mail Class Clone");
        return super.clone();
    }
}
