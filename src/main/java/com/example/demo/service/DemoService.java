package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public interface DemoService {
    void demo();

    int fibo(int num);
}
