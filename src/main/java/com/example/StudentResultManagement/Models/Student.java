package com.example.StudentResultManagement.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "student")
public class Student {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String name;
    private String email;
    private int marks;

//    public Student(int id, String name, String email, int marks) {
//        Id = id;
//        this.name = name;
//        this.email = email;
//        this.marks = marks;
//    }
}
