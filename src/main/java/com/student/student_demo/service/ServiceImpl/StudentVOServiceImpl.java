package com.student.student_demo.service.ServiceImpl;

import com.student.student_demo.dao.StudentVOMapper;
import com.student.student_demo.pojo.StudentVO;
import com.student.student_demo.service.StudentVOSercie;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentVOServiceImpl implements StudentVOSercie {
    @Resource
    private StudentVOMapper studentMapper;

    @Override
    public List<StudentVO> getList() {
        return studentMapper.getList();
    }

    @Override
    public int add(StudentVO studentVO) {
        return studentMapper.add(studentVO);
    }
}
