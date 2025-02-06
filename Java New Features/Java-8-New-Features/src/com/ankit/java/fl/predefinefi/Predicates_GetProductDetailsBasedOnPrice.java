package com.ankit.java.fl.predefinefi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Product {
	String productId;
	String productName;
	double price;

	public Product(String productId, String productName, double price) {
		System.out.println("Product::0-param constructor");
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
}

public class Predicates_GetProductDetailsBasedOnPrice {
	public static void main(String[] args) {
		System.out.println("GetProductDetailsBasedOnPrice.main()::main started");
		
		//create Product object and initialize it with sepecific value
		Product product1 = new Product("product12345", "Laptop", 300000);
		Product product2 = new Product("product12346", "CPU", 2000);
		Product product3 = new Product("product12347", "Phone", 15999);
		Product product4 = new Product("product12348", "Keyboard", 499);
		Product product5 = new Product("product12349", "HardDisk", 1700);
		Product product6 = new Product("product123410", "Mouse", 250);
		
		//adding to the list 
		List<Product> productList =  Arrays.asList(product1,product2,product3,product4,product5,product6);
		
		//creating lambda expression to testing product credential
		Predicate<Product> prodPredicate = p -> p.price>=2000;
		
		//verifying the  details and display
		for(Product product : productList) {
			if(prodPredicate.test(product)) {
				System.out.println(product.productId+"------"+product.productName+"-----"+product.price);
			}
		}
		System.out.println("GetProductDetailsBasedOnPrice.main()::main ended");
	}
}
