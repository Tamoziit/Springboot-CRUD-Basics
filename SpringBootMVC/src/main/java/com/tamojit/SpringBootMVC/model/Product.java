package com.tamojit.SpringBootMVC.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Data Object/ORM
@AllArgsConstructor // to create Data object from constructor setter
@NoArgsConstructor // for creating a object via a constructor with no args via H2 JPA
@Entity
public class Product {
    @Id // Primary key
    private int prodId;
    private String prodName;
    private int price;
}
