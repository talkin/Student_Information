package com.thoughtworks.student;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: talkin
 * Date: 13-12-18
 * Time: 下午9:48
 * To change this template use File | Settings | File Templates.
 */
public class StudentTest {
    StudentViewOne viewOne = new StudentViewOne();
    StudentViewTwo viewTwo = new StudentViewTwo();
    List<Student> students = new LinkedList<Student>();

    @Test
    public void should_view_one_student_information() throws Exception {
        Student student = new Student("A", 100);
        assertThat(viewOne.getOneStudentInformationInViewOne(student), is("A,100"));
    }

    @Test
    public void should_view_many_students_information() throws Exception {
        students.add(new Student("A",100));
        students.add(new Student("B",98));
        students.add(new Student("C",99));
        assertThat(viewOne.getManyStudentsInformationInViewOne(students), is("A,100\nB,98\nC,99\n"));
    }

    @Test
    public void should_print_students_get_PassScore_in_viewOne() throws Exception {
        students.add(new Student("A",100));
        students.add(new Student("B",59));
        assertThat(viewOne.printStudentsGetPassScore(students), is("A,100\n"));
    }

    @Test
    public void should_get_one_student_passScore_viewOne() throws Exception {
        students.add(new Student("A",90));
        assertThat(viewTwo.getOneStudentInformation(students), is("{A:90}"));
    }

    @Test
    public void should_get_many_students_passScore_viewTwo() throws Exception {
        students.add(new Student("A",100));
        students.add(new Student("B",90));
        assertThat(viewTwo.getManyStudentInformation(students), is("{A:100,B:90,}"));
    }

    @Test
    public void should_transform_Arabic_to_Roman() throws Exception {
        Student studentC = new Student("C",96);
        students.add(studentC);
        assertThat(viewOne.transformArabicToRoman(studentC), is("XCVI"));
    }
}
