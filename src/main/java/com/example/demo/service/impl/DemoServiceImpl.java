package com.example.demo.service.impl;

import com.example.demo.service.DemoService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
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



    private Map<Integer, Integer> fiboMap = new HashMap<>();

    // sequence: 1 1 2 3 5 8 13
    // input = 1, output 1
    // input = 2, output 1
    // input = 3 , output = 2
    // input = 4 , output = 3
    // input = 5, output = 5
    // input = 6, output = 8
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

        // if (num < 2) { return 1; };
        // return fiboMap.computeIfAbsent(num, (key) -> fibo(num - 1) + fibo(num - 2));
    }

    public static void main(String[] args) {
        Pizza pizza = new SomePizza(new SomeOtherPizza(new BasePizza()));
        pizza.topping();
    }
}


interface Pizza {
    void topping();
}

class BasePizza implements Pizza {
    public void topping() {
        System.out.println("base pizza topping");
    }
}


@AllArgsConstructor
@NoArgsConstructor
class SomePizza implements Pizza {
    private Pizza pizza;
    public void topping() {
        pizza.topping();
        System.out.println("some topping");
    }
}

@AllArgsConstructor
@NoArgsConstructor
class SomeOtherPizza implements Pizza {
    private Pizza pizza;
    public void topping() {
        pizza.topping();
        System.out.println("some other topping");
    }
}
