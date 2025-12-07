// src/main/java/com/coursework/javaapp/JavaAppApplication.java

package com.coursework.javaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaAppApplication.class, args);
    }

    // Простий REST-контролер для тестування (як у Розділі 4)
    @GetMapping("/api/status")
    public String getStatus() {
        return "UPDATE! Java Application is running! Version 0.0.1";
    }
}
