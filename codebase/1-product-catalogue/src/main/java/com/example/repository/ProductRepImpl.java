package com.example.repository;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.model.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
@Component
public class ProductRepImpl  implements ProductRepository{
	@PersistenceContext
	private EntityManager em;
	@Override
	public Product addNewProduct(Product product) {
		em.persist(product); //saved in the Database
		return product;
	}
	@Override
	public Product searchById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> allProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> searchByPriceMoreThan(float price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updatePrice(int pid, float newPrice) {
		// TODO Auto-generated method stub
		return null;
	}

}
