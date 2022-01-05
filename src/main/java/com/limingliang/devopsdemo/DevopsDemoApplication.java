package com.limingliang.devopsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DevopsDemoApplication {

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index() {
        return "I am devops-demo Index!";
    }

    public static void main(String[] args) {
        SpringApplication.run(DevopsDemoApplication.class, args);
    }

}
