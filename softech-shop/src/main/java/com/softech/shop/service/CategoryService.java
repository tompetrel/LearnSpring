package com.softech.shop.service;

import java.util.Optional;

import com.softech.shop.entity.Category;

public interface CategoryService {

	<S extends Category> Iterable<S> saveAll(Iterable<S> arg0);

	<S extends Category> S save(S arg0);

	Optional<Category> findById(Integer arg0);

	Iterable<Category> findAllById(Iterable<Integer> arg0);

	Iterable<Category> findAll();

	boolean existsById(Integer arg0);

	void deleteById(Integer arg0);

	void deleteAll(Iterable<? extends Category> arg0);

	void deleteAll();

	void delete(Category arg0);

	long count();

}
