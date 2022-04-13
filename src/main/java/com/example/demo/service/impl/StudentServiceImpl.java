package com.example.demo.service.impl;

import com.example.demo.model.Student;
import com.example.demo.rest.controller.model.StudentReq;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        log.info("getAllStudents.........");
        return studentRepository.findAll();
    }

    public void addStudent(StudentReq studentReq) {
        log.info("addStudent........., {}", studentReq);
    }
}
