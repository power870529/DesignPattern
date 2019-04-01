package com.design.pattern.creational.singleton;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-03-26 08:55:11
 */
public enum  EnumInstance {

    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}
