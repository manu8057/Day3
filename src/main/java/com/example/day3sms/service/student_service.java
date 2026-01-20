package com.example.day3sms.service;

import com.example.day3sms.model.StudentModel;
import com.example.day3sms.repository.student_repository;
import org.springframework.stereotype.Service;

@Service
public class student_service {
    private student_repository repository;
    public student_service(student_repository repository) {
        this.repository = repository;
    }
    public StudentModel addStudent(StudentModel student) {
        return repository.save(student);
    }
}
