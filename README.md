# Springboot-CRUD-Basics
**Springboot CRUD Basics**

## Important Concepts:
- **Dependency Injection (DI)**: Spring manages the whole lifecycle of objects in a project, so that the devs can focus on business logic rather than creating, managing & destroying 100s of objects across the project. DI is the *Design Pattern* that implements the principle of **Inversion of Control**, where the control of objects is outsourced to external managers from the devs.
- **Methods of Dependency Injection**:
1. Constructor Injection
2. Setter Injection
3. Field Injection
- **Springboot**: Build on top of Spring framework to handle object creation configs, setting up servers (Apache Tomcat), etc. from its end, without having to explicitly handle all these configs bottom-up in raw Spring Framework. [NB: Java Springboot packages itself with a apache tomcat server out-of-the-box]