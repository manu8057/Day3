package com.example.day3sms.service;

import com.example.day3sms.model.StudentModel;
import com.example.day3sms.repository.student_repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class student_service {
    private final student_repository repository;
    public student_service(student_repository repository) {
        this.repository = repository;
    }
    public StudentModel addStudent(StudentModel student) {
        return repository.save(student);
    }
    public List<StudentModel> getStudents(){
        return repository.findAll();
    }
    public StudentModel updateStudent(String id, StudentModel student) {
        StudentModel existingStudent=repository.findById(id)
                .orElseThrow(()->new RuntimeException("student not found"));
        existingStudent.setName(student.getName());
        existingStudent.setAge(student.getAge());
        existingStudent.setEmail(student.getEmail());
        return repository.save(existingStudent);
    }
    public void deleteStudent(String id) {
        StudentModel ex=repository.findById(id)
                .orElseThrow(()->new RuntimeException("student not found"));
        repository.delete(ex);
    }
}
