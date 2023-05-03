package com.example.StudentResultManagement.Converter;

import com.example.StudentResultManagement.DTO.StudentRequestDTO;
import com.example.StudentResultManagement.DTO.StudentResponseDTO;
import com.example.StudentResultManagement.Models.Student;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StudentConverter {

    public static Student StudentRequestDTOtoStudent(StudentRequestDTO studentRequestDTO){
        log.info("This is my Convertor");
        return Student.builder()
                .name(studentRequestDTO.getName())
                .email(studentRequestDTO.getEmail())
                .marks(studentRequestDTO.getMarks())
                .build();
    }

    public static StudentResponseDTO StudenttoStudentResponseDTO(Student student){
        return StudentResponseDTO.builder()
                .name(student.getName())
                .email(student.getEmail())
                .marks(student.getMarks())
                .build();
    }
}
