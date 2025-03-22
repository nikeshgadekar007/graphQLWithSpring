package com.javatechie.inventory_services.repository;

import com.javatechie.inventory_services.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByCategory(String category);
}
