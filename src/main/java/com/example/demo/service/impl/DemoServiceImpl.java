package com.example.demo.service.impl;

import com.example.demo.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public void demo() {
        log.info("demo.........");
    }

    // input = 1, output 1
    // input = 2, output 1
    // input = 3 , output = 2
    // input = 4 , output = 3
    // input = 5, output = 5
    // input = 6, output = 8
    // 1 1 2 3 5 8 13

    private Map<Integer, Integer> fiboMap = new HashMap<>();

    // 5
    @Override
    public int fibo(int num) {
        if (num == 1) return 1;
        if (num == 2) return 1;

        if (fiboMap.get(num) != null)
            return fiboMap.get(num);
        else {
            int res1 =  fibo(num - 1);
            int res2 =  fibo(num - 2);

            fiboMap.put(num - 1, res1);
            fiboMap.put(num - 2, res2);

            return res1 + res2;
        }
    }
}
