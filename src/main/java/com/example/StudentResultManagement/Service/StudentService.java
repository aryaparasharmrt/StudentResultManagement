package com.example.StudentResultManagement.Service;

import com.example.StudentResultManagement.Converter.StudentConverter;
import com.example.StudentResultManagement.DTO.StudentRequestDTO;
import com.example.StudentResultManagement.DTO.StudentResponseDTO;
import com.example.StudentResultManagement.Models.Student;
import com.example.StudentResultManagement.Repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public String addStudent(StudentRequestDTO studentRequestDTO){

        Student student = StudentConverter.StudentRequestDTOtoStudent(studentRequestDTO);
        studentRepository.save(student);

        return "Student Added Successfully";
    }

    public StudentResponseDTO getStudentById(int Id) throws Exception{
        Student student = null;

        try{
            student = studentRepository.findById(Id).get();
        }catch (Exception e){
            log.error("Invalid User", e);
        }
        StudentResponseDTO studentResponseDTO = StudentConverter.StudenttoStudentResponseDTO(student);
        return studentResponseDTO;
    }

    public List<Student> getAllStudents(){
        List<Student> studentList = studentRepository.findAll();
        return studentList;
    }
}
