package org.java.batis.services;

import org.java.batis.domain.Student;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * Created by root on 25/08/2015.
 */
public class StudentServiceTest {

    private static StudentService studentService;

    @BeforeClass
    public static void setup(){
        studentService = new StudentService();
    }

    @AfterClass
    public static void tearDown(){
        studentService = null;
    }

    @Test
    public void testFindAllStudent(){
        List<Student> students = studentService.findAllStudent();
        Assert.assertNotNull(students);
        students.forEach(student -> System.out.println(student));
    }

    @Test
    public void testFindStudentById(){
        Student student = studentService.findStudentById(1);
        Assert.assertNotNull(student);
        System.out.println(student);
    }

    @Test
    public  void testCreateStudent(){
        Integer id = 3;
        Student student = new Student("Student_"+id, "STudent_"+id+"@gmail.com",new Date());
        Student newStudent = studentService.findStudentById(3);
        studentService.createStudent(student);
    }

}