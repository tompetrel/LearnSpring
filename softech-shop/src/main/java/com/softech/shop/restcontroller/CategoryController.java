package com.softech.shop.restcontroller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softech.shop.entity.Category;
import com.softech.shop.entity.Product;
import com.softech.shop.exception.CategoryNotPoundException;
import com.softech.shop.service.CategoryService;

@RestController
@RequestMapping("categories")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	@PostMapping("")
	public void insert(@RequestBody Category category) {
		categoryService.save(category);
	}
	@PutMapping("/{id}/upd")
	public Category update(@PathVariable(name = "id")Integer id, @RequestBody Category cate) {
		Category category = categoryService.findById(id).map(ct->{
			ct.setName(cate.getName());
			return categoryService.save(ct);
		}).get();
		return cate;
		 
	}
	
	@GetMapping("/{id}/get")
	public Category get(@PathVariable(name = "id")Integer id) {
		Category category = categoryService.findById(id).orElseThrow(()-> new CategoryNotPoundException());
		return category;
	}
	@GetMapping("")
	public List<Category> listAll(){
		return (List<Category>) categoryService.findAll();
	}
	
	
}
