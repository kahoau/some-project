package com.example.demo.rest.controller.model;

import com.example.demo.model.Gender;
import lombok.Data;


@Data
public class StudentReq {
    private String name;
    private String email;
    private Gender gender;
}
