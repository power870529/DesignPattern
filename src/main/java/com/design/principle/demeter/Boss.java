package com.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class Boss {

    /*
        Boss 类的朋友是指：成员变量和方法的入参、出参；
        这里 TeamLeader 作为方法的入参是 Boss 的朋友，
        但是 Course 作为方法内部的类，并不是Boss 的朋友。
        迪米特原则强调：只和朋友交流，不和陌生人说话。
        Course 应该是 TeamLeader 创建而不是 Boss。
     */
//    v1.0
//    public void commandCheckNumber(TeamLeader teamLeader) {
//        List<Course> courseList = new ArrayList<Course>();
//        for (int i = 0; i < 20; i++) {
//            courseList.add(new Course());
//        }
//
//        teamLeader.checkNumberOfCourses(courseList);
//
//    }

//    v2.0
    public void commandCheckNumber(TeamLeader teamLeader) {
        teamLeader.checkNumberOfCourses();
    }
}
