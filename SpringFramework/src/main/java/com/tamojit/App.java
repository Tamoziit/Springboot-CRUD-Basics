package com.tamojit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // creates a container for SpringFramework without boot
        Dev obj = context.getBean("dev", Dev.class);

        // using getter/setter
//        obj.setAge(10);
//        System.out.println(obj.getAge());

        // Injection: using Spring framework to assign value to age instead of the custom setter --> utilizing <property> inside <bean> for Dev in spring.xml
        System.out.println(obj.getAge());
        obj.build();

        Dev obj2 = context.getBean("dev2", Dev.class);
        System.out.println(obj2.getAge()); // returns default 0 since property for setting age not defined for dev2 bean

        // Injection using constructor argument
        Dev obj3 = context.getBean("dev3", Dev.class);
        System.out.println(obj3.getAge());
        obj3.build(); // Laptop through constructor injection
    }
}