package com.design.pattern.creational.abstractfactory;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-03-01 08:55:44
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Article getArticle() {
        return new JavaArticle();
    }

    @Override
    public Vedio getVedio() {
        return new JavaVedio();
    }
}
