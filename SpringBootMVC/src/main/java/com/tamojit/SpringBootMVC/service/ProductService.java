package com.tamojit.SpringBootMVC.service;

import com.tamojit.SpringBootMVC.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service // Service Component
public class ProductService {
    List<Product> products = Arrays.asList(
            new Product(101, "Realme", 50000),
            new Product(102, "Xiaomi", 70000)
    );

    public List<Product> getProducts() {
        return products; //processing logic in service layer
    }
}
