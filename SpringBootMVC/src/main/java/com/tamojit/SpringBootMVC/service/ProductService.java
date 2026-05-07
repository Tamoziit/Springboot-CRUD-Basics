package com.tamojit.SpringBootMVC.service;

import com.tamojit.SpringBootMVC.model.Product;
import com.tamojit.SpringBootMVC.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service // Service Component --> without JPA
//public class ProductService {
//    @Autowired
//    ProductRepo repo;
//
//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101, "Realme", 50000),
//            new Product(102, "Xiaomi", 70000)
//    ));
//
//    public List<Product> getProducts() {
//        return products; //processing logic in service layer
//    }
//
//    public Product getProductById(int id) {
//        return products.stream() // utilizing Java Stream API to fetch product by id
//                .filter(p -> p.getProdId() == id)
//                .findFirst()
//                .orElse(new Product(100, "Default", 0)); // default result
//    }
//
//    public void addProduct(Product product) {
//        products.add(product);
//    }
//
//    public void updateProduct(Product product) {
//        int index = 0;
//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).getProdId() == product.getProdId()) {
//                index = i;
//            }
//        }
//
//        products.set(index, product);
//    }
//
//    public void deleteProduct(int id) {
//        int index = 0;
//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).getProdId() == id) {
//                index = i;
//            }
//        }
//
//        products.remove(index);
//    }
//}

@Service // Service component using JPA
public class ProductService {
    @Autowired
    ProductRepo repo;

    public List<Product> getProducts() {
        return repo.findAll(); // fetched by JPA
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(new Product()); // utilizing No Args constructor to create a blank object
    }

    public void addProduct(Product product) {
        repo.save(product);
    }

    public void updateProduct(Product product) {
        repo.save(product); // checks if data present --> if yes, update, else creates a new entry
    }

    public void deleteProduct(int id) {
        repo.deleteById(id);
    }
}