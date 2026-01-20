package com.example.day3sms.Controller;

import com.example.day3sms.model.StudentModel;
import com.example.day3sms.service.student_service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//hnji
@RestController
public class StudentController {
    @GetMapping("/")
    public String student(){
        return "Home page for student";
    }
    private final student_service service;
    public StudentController(student_service service){
        this.service = service;
    }
    @PostMapping("add-student/")
    public StudentModel addStudent(@RequestBody StudentModel student){
        return service.addStudent(student);
    }
}
