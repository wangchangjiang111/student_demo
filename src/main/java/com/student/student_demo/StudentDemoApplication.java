package com.student.student_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.student.student_demo.dao")
public class StudentDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentDemoApplication.class, args);
    }

}
