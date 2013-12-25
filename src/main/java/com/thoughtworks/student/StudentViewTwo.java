package com.thoughtworks.student;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: talkin
 * Date: 13-12-18
 * Time: 下午11:40
 * To change this template use File | Settings | File Templates.
 */
public class StudentViewTwo {
    public String getOneStudentInformation(List<Student> students) {
        String result = "";
        for (Student student :students) {
            result = result + "{" + student.getName() + ":" + student.getScore() + "}";
        }
        return result;
    }

    public String getManyStudentInformation(List<Student> students) {
        String result = "";
        for (Student student : students) {
            result = result + student.getName() + ":" + student.getScore() + ",";
        }
        return "{" + result + "}";
    }
}
