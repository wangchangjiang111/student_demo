package com.student.student_demo.Controller;

import com.student.student_demo.pojo.StudentVO;
import com.student.student_demo.service.StudentVOSercie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class StudentVOController {
    @Resource
    private StudentVOSercie studentVOSercieImpl;
    @RequestMapping("/list")
    public String getList(Model model){
        List<StudentVO> list=studentVOSercieImpl.getList();
        model.addAttribute("list",list);
        return "list";
    }
    @RequestMapping("/addstudent")
    public String addstudent(){
        return "addstudent";
    }
    @RequestMapping("addSave")
    public String addSave(String name,String age,String gender,String telephone,String email,String classId){
        StudentVO student=new StudentVO();
        student.setName(name);
        student.setGender(gender);
        student.setAge(Integer.parseInt(age));
        student.setTelephone(telephone);
        student.setEmail(email);
        student.setClassId(Integer.parseInt(classId));
        if(studentVOSercieImpl.add(student)>0){
            return "redirect:/list";
        }
        return "list";
    }
}
