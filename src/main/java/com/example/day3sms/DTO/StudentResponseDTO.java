package com.example.day3sms.DTO;

import com.example.day3sms.model.StudentModel;

public record StudentResponseDTO (
     String id,
     String name,
     int age,
     String email)
{

}
