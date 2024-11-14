package com.example.service;

import java.util.List;

import com.example.model.Product;

public interface ProductService {
  List<Product> allProducts();
  
  Product  addNewProductService(Product product);
  Product searchByIdService(int id);
  List<Product> searchByPriceMoreThanService(float price);
  Product updatePriceService(int pid,float newPrice);
}
