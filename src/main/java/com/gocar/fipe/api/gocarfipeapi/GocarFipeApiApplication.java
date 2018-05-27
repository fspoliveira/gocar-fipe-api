package com.gocar.fipe.api.gocarfipeapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.gocar.fipe" })
public class GocarFipeApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GocarFipeApiApplication.class, args);
    }
}
