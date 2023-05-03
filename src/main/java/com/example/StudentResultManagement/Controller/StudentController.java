package com.example.StudentResultManagement.Controller;

import com.example.StudentResultManagement.DTO.StudentRequestDTO;
import com.example.StudentResultManagement.DTO.StudentResponseDTO;
import com.example.StudentResultManagement.Models.Student;
import com.example.StudentResultManagement.Service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add_Student")
    public String addStudent(@RequestBody StudentRequestDTO studentRequestDTO){
        log.info("This is Information");
        return studentService.addStudent(studentRequestDTO);
    }

    @GetMapping("/get_StudentById/{Id}")
    public StudentResponseDTO getStudentById(@PathVariable int Id) throws Exception{
        return studentService.getStudentById(Id);
    }

    @GetMapping("/get_allStudents")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
}
