package com.tamojit;

public class Dev {
    private int age;
    private Laptop laptop; // setter injection via spring.xml --> Autowired
    private Computer comp; // Depending on Implemented Class directly

    public Dev() {
        System.out.println("Dev Constructor");
    }

    public Dev(int age, Laptop laptop) {
        System.out.println("Dev 3 Constructor");
        this.age = age;
        this.laptop = laptop; // constructor injection
    }

    // Getter/Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter/Setter for Laptop
    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    // Getter/Setter for Computer
    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void build() {
        System.out.println("Working on Spring Framework!");
        laptop.compile();

        comp.compile();
    }
}
