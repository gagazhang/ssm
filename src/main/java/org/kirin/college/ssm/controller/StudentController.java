package org.kirin.college.ssm.controller;

import org.kirin.college.ssm.dao.Student;
import org.kirin.college.ssm.serices.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/getById")
    @ResponseBody
    public Student getStudentById(int id){
        return studentService.getStudentById(id);
    }
}
