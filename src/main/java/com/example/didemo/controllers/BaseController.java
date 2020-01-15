package com.example.didemo.controllers;

import com.example.didemo.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class BaseController {
    @Autowired
    @Qualifier("myService")
    BaseService baseService;


    @Autowired
    @Qualifier("anotherBaseService")
    BaseService anotherBaseService1;

    public String sayHello(){
        baseService.PrintMessage();
        anotherBaseService1.PrintMessage();
        return "hello";
    }
}
