package com.thoughtworks.student;

/**
 * Created with IntelliJ IDEA.
 * User: talkin
 * Date: 13-12-18
 * Time: 下午10:33
 * To change this template use File | Settings | File Templates.
 */
public class Student {
    private String name;
    private int score;

    public Student(String name,int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
