package com.design.pattern.creational.builder;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-03-05 08:50:36
 */
public class Test {

    public static void main(String[] args) {

        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();

        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("设计模式", "设计模式video", "设计模式article",
                "设计模式PPt", "设计模式QA");
        System.out.println(course);
    }
}
