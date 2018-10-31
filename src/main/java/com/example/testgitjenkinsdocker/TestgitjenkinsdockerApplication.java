package com.example.testgitjenkinsdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@SpringBootApplication
@RestController
public class TestgitjenkinsdockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestgitjenkinsdockerApplication.class, args);
    }

    @GetMapping("hello")
    public void hello(HttpServletResponse response) throws Exception {
        response.getWriter().write("hello my first test git+jenkis+docker!");
    }
}
