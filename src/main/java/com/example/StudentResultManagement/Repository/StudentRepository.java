package com.example.StudentResultManagement.Repository;

import com.example.StudentResultManagement.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    Student selectExistsEmail(String email);
    public Student findStudentByEmail(String email);
}
