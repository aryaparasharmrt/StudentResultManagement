package com.example.StudentResultManagement.Student;

import com.example.StudentResultManagement.Models.Student;
import com.example.StudentResultManagement.Repository.StudentRepository;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DataJpaTest
public class StudentRepositoryTest {

    @MockBean

    StudentRepository underTest;


    @Test
    public void test1(){

        String email = "arya123@gmail.com";
        Student student = new Student(1,"Arya", "arya123@gmail.com", 90);
        underTest.save(student);

        Student student1 = underTest.findStudentByEmail(email);

        boolean expected = student1 != null ? true : false;
        assertEquals(true, expected);
    }

}
