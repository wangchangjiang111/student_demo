package com.student.student_demo.dao;

import com.student.student_demo.pojo.StudentVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentVOMapper {
    public List<StudentVO> getList();
    public int add(StudentVO studentVO);
}
