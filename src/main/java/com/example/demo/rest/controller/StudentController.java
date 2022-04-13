package com.example.demo.rest.controller;

import com.example.demo.model.Student;
import com.example.demo.rest.controller.model.StudentReq;
import com.example.demo.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
@AllArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping
    public void addStudent(@Valid @RequestBody StudentReq studentReq) {
        studentService.addStudent(studentReq);
    }
}
