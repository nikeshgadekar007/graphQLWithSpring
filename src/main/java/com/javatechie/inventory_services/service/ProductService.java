package com.javatechie.inventory_services.service;

import com.javatechie.inventory_services.entity.Product;
import com.javatechie.inventory_services.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts(){
        return productRepository.findAll();
    };

    public Product getProductByCategory(String category){
        return productRepository.findByCategory(category);
    }

    public Product updateStock(int id, int stock) {
        Product existingProduct = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"+ id));
        existingProduct.setStock(stock);
        return productRepository.save(existingProduct);
    }

    public Product receiveNewShipment(int id, int quantity) {
        Product existingProduct = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"+ id));
        existingProduct.setStock(existingProduct.getStock()+quantity);
        return productRepository.save(existingProduct);
    }
}
