# Springboot-CRUD-Basics
**Springboot CRUD Basics**

## Important Concepts:
- **Dependency Injection (DI)**: Spring manages the whole lifecycle of objects in a project, so that the devs can focus on business logic rather than creating, managing & destroying 100s of objects across the project. DI is the *Design Pattern* that implements the principle of **Inversion of Control**, where the control of objects is outsourced to external managers from the devs.
- **Methods of Dependency Injection**:
  1. Constructor Injection
  2. Setter Injection
  3. Field Injection
- **Springboot**: Build on top of Spring framework to handle object creation configs, setting up servers (Apache Tomcat), etc. from its end, without having to explicitly handle all these configs bottom-up in raw Spring Framework. [NB: Java Springboot packages itself with a apache tomcat server out-of-the-box]
- **SpringApplication.run()**: Creates a container for the project objects inside Springboot's IoC Container to be run by JVM.
Container hierarchy: [JVM [IoC [Object of project]]]
- **Springboot MVC**:

  [Client] <--> Springboot Sever (running Java Servelets on Apache Tomcat server web containers)[Controllers --> Services --> Repository] <--> DB
- **Spring Front Controller**: The controller layer created by Spring to route requests to their corresponding Controllers via `@RequestMapping("<url>")`
- **MVC Layers**:
  1. **Controller Layer**: Responsible for handling client requests & interfacing with HTTP routes [sending & receiving data].
  2. **Service Layer**: Responsible for handling all *business logic* behind the controllers (not involved with data transactions)
  3. **Model Layer**: Data models & ORMs.
- **ORM**: *Object Relation Mapping* (ORM) maps a Java Object to a Relational table via a DB Query (like SQL Query).
- **Spring Data JPA [Repository Layer]**: Handles Data & ORM operations in Spring Framework