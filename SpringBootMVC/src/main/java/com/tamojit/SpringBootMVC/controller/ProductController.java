package com.tamojit.SpringBootMVC.controller;

import com.tamojit.SpringBootMVC.model.Product;
import com.tamojit.SpringBootMVC.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping("/products") // GET Method
    public List<Product> getProducts() {
        return service.getProducts(); // getting products from Service layer
    }

    @GetMapping("/products/{id}") // params
    public Product getProductById(@PathVariable int id) { // accepting id from path
        return service.getProductById(id);
    }

    @PostMapping("/products/add") // POST method
    public void addProduct(@RequestBody Product product) { // accepting product obj as JSON (via springboot.jackson) as request body
        service.addProduct(product);
    }

    @PutMapping("/products/update")
    public void updateProduct(@RequestBody Product product) {
        service.updateProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable int id) {
        service.deleteProduct(id);
    }
}
