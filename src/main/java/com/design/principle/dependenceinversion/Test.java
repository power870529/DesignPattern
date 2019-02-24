package com.design.principle.dependenceinversion;

public class Test {

    public static void main(String[] args) {

//        v1.0
//        Kevin kevin = new Kevin();
//        kevin.studyJavaCourse();
//        kevin.studyFECourse();

//        v2.0
//        Kevin kevin = new Kevin();
//        kevin.studyImoocCourse(new JavaCourse());
//        kevin.studyImoocCourse(new FECourse());

//        v3.0
//        Kevin kevin = new Kevin(new JavaCourse());
//        kevin.studyImoocCourse();

//        v4.0
        Kevin kevin = new Kevin();
        kevin.setiCourse(new JavaCourse());
        kevin.studyImoocCourse();

        kevin.setiCourse(new FECourse());
        kevin.studyImoocCourse();
    }
}
