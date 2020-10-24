package com.softech.shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.softech.shop.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{
	List<Product> findProductsByNameContaining(String name);
	
	@Query("select p from Product p where p.quantity > ?1 and p.price > ?2")
	List<Product> findByQuantityPrice(int quantity, float price);
}
