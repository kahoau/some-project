package com.example.demo.service.impl;

import com.example.demo.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public void demo() {
        log.info("demo.........");
    }
}
