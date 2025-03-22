package com.javatechie.inventory_services.resource;


import com.javatechie.inventory_services.entity.Product;
import com.javatechie.inventory_services.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getProducts(){
        return productService.getProducts();
    };

    @GetMapping("/{category}")
    public Product getProductByCategory(@PathVariable String category){
        return productService.getProductByCategory(category);
    }
}
