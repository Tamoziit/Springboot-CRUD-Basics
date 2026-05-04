package com.tamojit.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // specifies Springboot to treat this class under IoC for Object lifecycle
           // management inside IoC container
public class Dev {
    // Laptop laptop; // gives Null point exception without DI & Autowiring (since
    // this instance variable is NULL by default)
    // private Laptop laptop = new Laptop(); // doesn't give error but nott IoC as
    // well

    // connecting Laptop obj with Dev Obj inside IoC without having to invoke
    // ApplicationContext class
    @Autowired
    private Laptop laptop1; // Field injection

    // Constructor injection
    private Laptop laptop2;

    public Dev(Laptop laptop) {
        this.laptop2 = laptop;
    }

    // Setter injection
    @Autowired
    private Laptop laptop3;

    public void setLaptop(Laptop laptop) {
        this.laptop3 = laptop;
    }

    // Better practice --> using the parent class that implements the subclass -->
    // here Computer
    @Autowired // using field injection for simplicity --> preferred constructor & setter
    private Computer comp;

    public void build() {
        System.out.println("Dependency Injection Test!");

        // Autowiring/field injection
        laptop1.compile();

        // constructor injection
        laptop2.compile();

        // setter injection
        laptop3.compile();

        comp.compile(); // the invoking class should be dependent on the implemented class (Computer)
                        // not the implementing one (Laptop)
    }
}
