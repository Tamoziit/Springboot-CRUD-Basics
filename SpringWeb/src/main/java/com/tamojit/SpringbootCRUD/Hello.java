package com.tamojit.SpringbootCRUD;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // for a REST API endpoint
public class Hello {
    @RequestMapping("/") // request to / path
    public String greet() {
        return "Hello World!";
    }
}
