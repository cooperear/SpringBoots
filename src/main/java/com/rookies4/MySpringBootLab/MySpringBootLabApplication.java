package com.rookies4.MySpringBootLab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// MySpringBootLabApplication.java
@SpringBootApplication
@ComponentScan("com.rookies4.MySpringBootLab")
public class MySpringBootLabApplication {
    public static void main(String[] args) {
        SpringApplication.run(MySpringBootLabApplication.class, args);
    }
}
