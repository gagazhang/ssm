package org.kirin.college.ssm.serices.impl;

import org.kirin.college.ssm.dao.Student;
import org.kirin.college.ssm.dao.StudentMapper;
import org.kirin.college.ssm.serices.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentMapper studentMapper;

    public Student getStudentById(int id) {
        Student stu  = studentMapper.selectByPrimaryKey(id);
//        stu = new Student();
//        stu.setId(1);
//        stu.setName("John");
//        stu.setPassword("John");
//        stu.setSex("M");
        return stu;
    }
}
