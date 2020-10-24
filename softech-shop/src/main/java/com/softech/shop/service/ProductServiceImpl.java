package com.softech.shop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softech.shop.entity.Product;
import com.softech.shop.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired 
	private ProductRepository productRepository;
	
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public long count() {
		return productRepository.count();
	}

	@Override
	public void delete(Product arg0) {
		productRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		productRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Product> arg0) {
		productRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		productRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return productRepository.existsById(arg0);
	}

	@Override
	public Iterable<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public Iterable<Product> findAllById(Iterable<Integer> arg0) {
		return productRepository.findAllById(arg0);
	}

	@Override
	public Optional<Product> findById(Integer arg0) {
		return productRepository.findById(arg0);
	}

	@Override
	public <S extends Product> S save(S arg0) {
		return productRepository.save(arg0);
	}

	@Override
	public <S extends Product> Iterable<S> saveAll(Iterable<S> arg0) {
		return productRepository.saveAll(arg0);
	}

	@Override
	public List<Product> findProductsByNameContaining(String name) {
		return productRepository.findProductsByNameContaining(name);
	}

	@Override
	public List<Product> findByQuantityPrice(int quantity, float price) {
		return productRepository.findByQuantityPrice(quantity, price);
	}
	
	
}
