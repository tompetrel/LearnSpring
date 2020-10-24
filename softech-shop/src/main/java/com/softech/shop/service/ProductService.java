package com.softech.shop.service;

import java.util.List;
import java.util.Optional;

import com.softech.shop.entity.Product;

public interface ProductService {

	<S extends Product> Iterable<S> saveAll(Iterable<S> arg0);

	<S extends Product> S save(S arg0);

	Optional<Product> findById(Integer arg0);

	Iterable<Product> findAllById(Iterable<Integer> arg0);

	Iterable<Product> findAll();

	boolean existsById(Integer arg0);

	void deleteById(Integer arg0);

	void deleteAll(Iterable<? extends Product> arg0);

	void deleteAll();

	void delete(Product arg0);

	long count();

	List<Product> findByQuantityPrice(int quantity, float price);

	List<Product> findProductsByNameContaining(String name);

}
