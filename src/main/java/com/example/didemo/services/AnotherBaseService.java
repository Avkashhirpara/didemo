package com.example.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class AnotherBaseService implements  BaseService{
    @Override
    public void PrintMessage() {
        System.out.println("hello Another Base Services");
    }
}
