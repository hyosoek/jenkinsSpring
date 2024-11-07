package com.example.compilejava;

import org.springframework.stereotype.Service;


@Service
public class Calculator {
    public int sum(int a, int b){
        return a + b;
    }
}
