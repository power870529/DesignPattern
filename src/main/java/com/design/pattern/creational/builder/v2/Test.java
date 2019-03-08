package com.design.pattern.creational.builder.v2;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-03-05 09:08:53
 */
public class Test {

    public static void main(String[] args) {

        Course course = Course.builder()
                .buildCourseName("设计模式")
                .buildCoursePPT("设计模式PPT")
                .buildCourseVideo("设计模式Video").build();
        System.out.println(course);

    }
}
