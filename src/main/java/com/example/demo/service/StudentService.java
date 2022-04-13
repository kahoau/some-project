package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.rest.controller.model.StudentReq;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    void addStudent(StudentReq studentReq);
}
