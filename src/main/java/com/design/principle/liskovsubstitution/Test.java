package com.design.principle.liskovsubstitution;

public class Test {

    /*
        根据里氏替换原则，当我们把父类替换成子类进行执行的时候，程序的行为没有发生变化。
        而在这里demo中，当用square 替换了它的父类 rectangle的时候，程序的行为发生了变化，
        违反了里氏替换原则。因此，在这个业务场景下，square 不能 作为 rectangle 的子类。
     */
    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
            System.out.println("width:" + rectangle.getWidth() + ",length:" + rectangle.getLength());
        }
    }

    public static void main(String[] args) {
//        v1.0
//        Rectangle rectangle = new Rectangle();
//        rectangle.setWidth(10);
//        rectangle.setLength(20);

//        v2.0
        Rectangle rectangle = new Square();
        rectangle.setLength(10);

        Test.resize(rectangle);
        System.out.println("resize is over: width:" + rectangle.getWidth() + ",length:" + rectangle.getLength());
    }
}
