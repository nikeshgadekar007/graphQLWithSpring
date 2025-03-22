package com.javatechie.inventory_services.resource;


import com.javatechie.inventory_services.entity.Product;
import com.javatechie.inventory_services.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController
//@RequestMapping("/products")
//public class ProductController {
//
//    @Autowired
//    private ProductService productService;
//
//    @GetMapping
//    public List<Product> getProducts(){
//        return productService.getProducts();
//    };
//
//    @GetMapping("/{category}")
//    public Product getProductByCategory(@PathVariable String category){
//        return productService.getProductByCategory(category);
//    }
//}
@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @QueryMapping
    public List<Product> getProducts(){
        return productService.getProducts();
    };

    @QueryMapping
    public Product getProductByCategory(@Argument String category){
        return productService.getProductByCategory(category);
    }

    @MutationMapping
    public Product updateProduct(@Argument int id, @Argument int stock){
        return productService.updateStock(id, stock);
    }

    @MutationMapping
    public Product receiveNewShipment(@Argument int id, @Argument int quantity){
        return productService.receiveNewShipment(id, quantity);
    }
}