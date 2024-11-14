package com.example.repository;

import java.util.List;

import com.example.model.Product;
public interface ProductRepository {
Product  addNewProduct(Product product);
Product searchById(int id);
List<Product> allProducts();
List<Product> searchByPriceMoreThan(float price);
Product updatePrice(int pid,float newPrice);
}
