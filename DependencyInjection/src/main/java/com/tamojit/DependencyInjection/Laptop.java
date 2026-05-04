package com.tamojit.DependencyInjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component // connecting to IoC container
@Primary // tells the compiler to run this container overall other Components which implement the same Parent Class
public class Laptop implements Computer {
    @Override
    public void compile() {
        System.out.println("Compiling code...");
    }
}
