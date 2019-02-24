package com.design.principle.dependenceinversion;

public class Kevin {

//    v1.0
//    public void studyJavaCourse(){
//        System.out.println("Kevin正在学习java课程");
//    }
//
//    public void studyFECourse(){
//        System.out.println("Kevin正在学习前端课程");
//    }
//
//    /*
//        现在的做法就是面向实现编程。因此随着需求的变化，这个实现类是需要经常修改的。扩展性比较差
//        因为没有抽象，所以应用层的函数（本例中的main方法）是依赖于底层实现的。
//        根据依赖倒置原则：高层模块不应该依赖底层模块，二者都应该依赖其抽象。
//     */
//    public void studyPythonCourse(){
//        System.out.println("Kevin正在学习Python课程");
//    }

//    v2.0
//    public void studyImoocCourse(ICourse iCourse){
//        iCourse.studyCourse();
//    }

//    v3.0
//    private ICourse iCourse;
//
//    public Kevin(ICourse iCourse) {
//        this.iCourse = iCourse;
//    }
//    public void studyImoocCourse(){
//        iCourse.studyCourse();
//    }

//    v4.0
    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }
    public void studyImoocCourse(){
        iCourse.studyCourse();
    }
}
