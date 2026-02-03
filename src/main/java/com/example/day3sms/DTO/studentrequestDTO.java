package com.example.day3sms.DTO;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document
public class studentrequestDTO{
    @Id
    private String id;
    @NotBlank(message="Name cannot be empty")
    private String name;
    @Max(value=100 ,message = "Age must less than equals to 100")
    @Min(value=18 ,message ="Age must greater than equals to 18")
    private int age;
    @Email(message="Email should be valid")
    @NotNull(message="Email cannot be empty")
    private String email;
}
