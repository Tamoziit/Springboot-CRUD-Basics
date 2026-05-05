package com.tamojit.SpringBootMVC.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // controller to handle requests over HTTP to get/return data of the request [not layouts or static pages]
public class HomeController {

    @RequestMapping("/")
    public String greet() {
        System.out.println("Inside function");
        return "Hello World";
    }

    @RequestMapping("/about")
    public String about() {
        System.out.println("Inside about function");
        return "About Spring MVC";
    }
}
