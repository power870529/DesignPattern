package com.design.pattern.creational.abstractfactory;

/**
 * @description:
 * @author: liuzh01
 * @create: 2019-03-01 08:59:27
 */
public class Test {

    public static void main(String[] args) {

        CourseFactory courseFactory = new JavaCourseFactory();
        Vedio vedio = courseFactory.getVedio();
        Article article = courseFactory.getArticle();

        vedio.produce();
        article.produce();
    }
}
