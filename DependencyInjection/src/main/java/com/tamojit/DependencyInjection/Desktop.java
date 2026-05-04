package com.tamojit.DependencyInjection;

import org.springframework.stereotype.Component;

@Component // connecting to IoC container
public class Desktop implements Computer {
    @Override
    public void compile() {
        System.out.println("Compiling code with GPU...");
    }
}
