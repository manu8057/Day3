package com.example.day3sms.model;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor //makes constructor of below variables
@NoArgsConstructor  //for null values
@Document(collection =  "student" )
public class StudentModel {

    @Id
    private String id;
    private String name;
    private int age;
    private String email;

}