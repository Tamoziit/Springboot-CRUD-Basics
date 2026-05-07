package com.tamojit.SpringBootMVC.repository;

import com.tamojit.SpringBootMVC.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // for Repository layer
public interface ProductRepo extends JpaRepository<Product, Integer> {
    // interface to run CRUD SQL queries defined in JPARepository class & use its functions to carry out DB queries
}
