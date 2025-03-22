package com.javatechie.inventory_services;

import com.javatechie.inventory_services.entity.Product;
import com.javatechie.inventory_services.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class InventoryServicesApplication {

//	@Autowired
//	private ProductRepository productRepository;
//
//	@PostConstruct
//	public void initDatabase(){
//	List<Product> products = Stream.of(
//			new Product("Laptop", "Electonics", 44.754f, 50),
//			new Product("Phome", "Electonics", 41000, 30),
//			new Product("Watch", "Electonics", 885.41f, 95),
//			new Product("Notebook", "Stationary", 98.4f, 97),
//			new Product("Desk Lamp", "Furniture", 65.4f, 500),
//		    new Product("Water bottle", "Accessories", 87, 20)
//	).toList();
//		productRepository.saveAll(products);
//	}

	public static void main(String[] args) {
		SpringApplication.run(InventoryServicesApplication.class, args);
	}

}
