package com.example.day3sms.repository;

import com.example.day3sms.model.StudentModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface student_repository extends MongoRepository <StudentModel,String> {
}
