package org.java.batis.services;

import org.apache.ibatis.session.SqlSession;
import org.java.batis.domain.Student;
import org.java.batis.mappers.StudentMapper;
import org.java.batis.until.MyBatisSqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by luongbangnguyen on 25/08/2015.
 */
public class StudentService {
    private Logger logger =
            LoggerFactory.getLogger(getClass());

    public List<Student> findAllStudent(){
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try{
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            return studentMapper.findAllStudents();
        }finally {
            sqlSession.close();
        }
    }

    public Student findStudentById(Integer studId){
        logger.debug("Select Student By ID :{}", studId);
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try{
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            return  studentMapper.findStudentById(studId);
        }finally {
            sqlSession.close();
        }
    }

    public void createStudent(Student student){
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try{
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            studentMapper.insertStudent(student);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
    }


}
