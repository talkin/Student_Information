package com.thoughtworks.student;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: talkin
 * Date: 13-12-18
 * Time: 下午10:44
 * To change this template use File | Settings | File Templates.
 */
public class StudentViewOne {
    public String getOneStudentInformationInViewOne(Student student) {
        String result = student.getName() + "," + student.getScore();
        return result;
    }

    public String getManyStudentsInformationInViewOne(List<Student> students) {
        String result = "";
        for (Student student : students) {
            if (student.getScore() >=60) {
                result = result + student.getName() + "," + student.getScore() + "\n";
            }
        }
        return result;
    }

    public String printStudentsGetPassScore(List<Student> students) {
        String result = "";
        for (Student student : students) {
            if (student.getScore() >= 60) {
                result = result + student.getName() + "," + student.getScore() + "\n";
            }
        }
        return result;
    }

    public String transformArabicToRoman(Student students) {
        int[] ArabicArray = {100,90,50,40,10,9,5,4,1};
        String[] RomanArray = {"C","XC","L","XL","X","IX","V","IV","I"};
        if (students.getScore() > 0) {
            int ArabicNumber = students.getScore();
            String RomanNumber = "";
            for (int i = 0; i < ArabicArray.length; i++) {
                while (ArabicNumber >= ArabicArray[i]) {
                    RomanNumber += RomanArray[i];
                    ArabicNumber -= ArabicArray[i];
                }
            }
            return RomanNumber;
        }
        return null;
    }
}
