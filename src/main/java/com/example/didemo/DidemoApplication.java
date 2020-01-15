package com.example.didemo;

import com.example.didemo.controllers.BaseController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DidemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DidemoApplication.class, args);
        context.getBean(BaseController.class).sayHello();
    }

}
