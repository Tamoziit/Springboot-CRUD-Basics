package com.tamojit.SpringBootMVC.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // Data Object/ORM
@AllArgsConstructor // to create Data object from constructor setter
public class Product {
    private int prodId;
    private String prodName;
    private int price;
}
