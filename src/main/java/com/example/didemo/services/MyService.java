package com.example.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class MyService implements BaseService {
    @Override
    public void PrintMessage() {
        System.out.println("hello my services");
    }
}
