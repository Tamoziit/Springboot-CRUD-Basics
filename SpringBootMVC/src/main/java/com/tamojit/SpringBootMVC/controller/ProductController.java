package com.tamojit.SpringBootMVC.controller;

import com.tamojit.SpringBootMVC.model.Product;
import com.tamojit.SpringBootMVC.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @RequestMapping("/products")
    public List<Product> getProducts() {
        System.out.println("getProducts");
        return service.getProducts(); // getting products from Service layer
    }
}
