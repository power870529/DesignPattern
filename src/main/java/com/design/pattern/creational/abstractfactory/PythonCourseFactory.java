package com.design.pattern.creational.abstractfactory;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-03-01 08:56:31
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Article getArticle() {
        return new PythonArticle();
    }

    @Override
    public Vedio getVedio() {
        return new PythonVedio();
    }
}
