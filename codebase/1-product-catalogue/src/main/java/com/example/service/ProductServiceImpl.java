package com.example.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.example.model.Product;
import com.example.repository.ProductRepository;

import jakarta.transaction.Transactional;
@Service
@Transactional//start & commit/rollback the transaction
public class ProductServiceImpl implements ProductService {
	@Autowired
	private Environment env;
	@Autowired
	private ProductRepository prodRep;
	@Override
	public List<Product> allProducts() {
		String port=env.getProperty("local.server.port");
		//Assume these data pulled from DB .....
		Product p1=new Product(101,"TShirt",1000,port);
		Product p2=new Product(102,"Jeans",2000,port);
		Product p3=new Product(103,"Mobile",10000,port);
		Product p4=new Product(104,"Laptop",5000,port);
		List<Product> plist=new ArrayList<>();
		plist.add(p1);plist.add(p2);plist.add(p3);plist.add(p4);
		return plist;
	}
	@Override
	public Product addNewProductService(Product product) {
		return prodRep.addNewProduct(product);
	}
	@Override
	public Product searchByIdService(int id) {
		// TODO Auto-generated method stub
		return prodRep.searchById(id);
	}
	@Override
	public List<Product> searchByPriceMoreThanService(float price) {
		// TODO Auto-generated method stub
		return prodRep.searchByPriceMoreThan(price);
	}
	@Override
	public Product updatePriceService(int pid, float newPrice) {
		// TODO Auto-generated method stub
		return prodRep.updatePrice(pid, newPrice);
	}

}
