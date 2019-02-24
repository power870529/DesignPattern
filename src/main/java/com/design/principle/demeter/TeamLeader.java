package com.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {

//    v1.0
//    public void checkNumberOfCourses(List<Course> courseList) {
//        System.out.println("在线课程的数量：" + courseList.size());
//    }

//    v2.0
    public void checkNumberOfCourses() {
        List<Course> courseList = new ArrayList<Course>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }

        System.out.println("在线课程的数量：" + courseList.size());
    }
}
