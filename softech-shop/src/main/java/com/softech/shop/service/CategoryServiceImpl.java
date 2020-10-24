package com.softech.shop.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softech.shop.entity.Category;
import com.softech.shop.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public long count() {
		return categoryRepository.count();
	}

	@Override
	public void delete(Category arg0) {
		categoryRepository.delete(arg0);
	}

	@Override
	public void deleteAll() {
		categoryRepository.deleteAll();
	}

	@Override
	public void deleteAll(Iterable<? extends Category> arg0) {
		categoryRepository.deleteAll(arg0);
	}

	@Override
	public void deleteById(Integer arg0) {
		categoryRepository.deleteById(arg0);
	}

	@Override
	public boolean existsById(Integer arg0) {
		return categoryRepository.existsById(arg0);
	}

	@Override
	public Iterable<Category> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public Iterable<Category> findAllById(Iterable<Integer> arg0) {
		return categoryRepository.findAllById(arg0);
	}

	@Override
	public Optional<Category> findById(Integer arg0) {
		return categoryRepository.findById(arg0);
	}

	@Override
	public <S extends Category> S save(S arg0) {
		return categoryRepository.save(arg0);
	}

	@Override
	public <S extends Category> Iterable<S> saveAll(Iterable<S> arg0) {
		return categoryRepository.saveAll(arg0);
	}
	
	
}
