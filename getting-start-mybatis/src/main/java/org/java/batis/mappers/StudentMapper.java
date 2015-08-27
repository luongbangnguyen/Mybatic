package org.java.batis.mappers;

import org.java.batis.domain.Student;

import java.util.List;

/**
 * interface mapper used in StudentMapper.xml
 *
 * Created by luongbangnguyen on 25/08/2015.
 */
public interface StudentMapper {

    /**
     * get all student
     * @return
     */
    List<Student> findAllStudents();

    /**
     * get student by id of student
     * @param id
     * @return
     */
    Student findStudentById(Integer id);

    /**
     * insert student to data base
     * @param student
     */
    void insertStudent(Student student);

    /**
     * get a student with address
     * @param studId
     * @return
     */
    Student selectStudentWithAddress(Integer studId);
}
