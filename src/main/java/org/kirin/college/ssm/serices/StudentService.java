package org.kirin.college.ssm.serices;

import org.kirin.college.ssm.dao.Student;

/**
 * 学生服务
 */
public interface StudentService {

    /**
     * 通过Id查找相关的学生
     * @param id
     * @return
     */
    public Student getStudentById(int id );
}
