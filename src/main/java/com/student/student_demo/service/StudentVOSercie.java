package com.student.student_demo.service;

import com.student.student_demo.pojo.StudentVO;

import java.util.List;

public interface StudentVOSercie {
    public List<StudentVO> getList();
    public int add(StudentVO studentVO);
}
