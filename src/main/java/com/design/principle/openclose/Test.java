package com.design.principle.openclose;

public class Test {

    public static void main(String[] args) {
//        v1.0
//        ICourse javaCourse = new JavaCourse(1, "设计模式", 384d);
//        System.out.println("id：" + javaCourse.getId() + ", 课程名称：" + javaCourse.getName() + ",价格：" + javaCourse.getPrice());

//        v2.0
        ICourse iCourse = new JavaDiscountCourse(1, "设计模式", 384d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
        System.out.println("id：" + javaCourse.getId() + ", 课程名称：" + javaCourse.getName() + "," +
                "原价：" + javaCourse.getPrice() + ",折后价格：" + javaCourse.discountPrice());
    }
}
