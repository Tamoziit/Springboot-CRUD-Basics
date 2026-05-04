package com.tamojit.DependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        // getting hold of the IoC container through parent class Application Context
        ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);

        // manual object management lifecycle --> no IoC container
        // Dev ob = new Dev();
        // ob.build();

        // object management through IoC container
        Dev obj = context.getBean(Dev.class);
        obj.build();
    }
}
