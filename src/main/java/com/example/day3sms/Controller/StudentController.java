package com.example.day3sms.Controller;

import com.example.day3sms.DTO.StudentResponseDTO;
import com.example.day3sms.DTO.studentrequestDTO;
import com.example.day3sms.model.StudentModel;
import com.example.day3sms.service.student_service;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class StudentController {
//    @GetMapping("/")
//    public String student(){
//        return "Home page for student";
//    }
    private final student_service service;
    public StudentController(student_service service){
        this.service = service;
    }
    @GetMapping("/students")
    public List<StudentModel> getStudents(){
        return service.getStudents();
    }
    @PostMapping("add-student/")
    public StudentResponseDTO addStudent(@Valid @RequestBody studentrequestDTO student){
        return service.addStudent(student);
    }
    @PutMapping("/update/{id}")
    public StudentModel updateStudent(@PathVariable String id, @RequestBody StudentModel student){
        return service.updateStudent(id, student);
    }
    @DeleteMapping("/deletestudent/{id}")
    public void deleteStudent(@PathVariable String id){
        service.deleteStudent(id);
    }
}
