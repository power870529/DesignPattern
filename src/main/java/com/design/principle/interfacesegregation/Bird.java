package com.design.principle.interfacesegregation;

public class Bird implements IAnimalAction {
    public void eat() {

    }

    public void fly() {

    }

    public void swim() {
        // 鸟不会游泳，这里的接口 IAnimalAction 没有遵循接口隔离原则； 导致鸟在实现这个接口的时候，还要实现这个空方法。
    }
}
