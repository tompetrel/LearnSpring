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
import com.softech.shop.exception.ProductNotPoundException;
import com.softech.shop.service.ProductService;

@RestController
@RequestMapping("products")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	
	@PostMapping("")
	public Product insert(@RequestBody Product product) {
		return productService.save(product);
	}
	@GetMapping("")
	public List<Product> listAll(){
		return (List<Product>) productService.findAll();
	}
	
	@GetMapping("{id}/get")
	public Product findById(@PathVariable(name = "id") Integer id) {
		Product product = productService.findById(id).orElseThrow(()->new ProductNotPoundException());
		return product;
	}
	
	@PutMapping("/{id}/upd")
	public Product update(@PathVariable(name = "id")Integer id, @RequestBody Product product) {
		Product pro = productService.findById(id).map(pr->{
			pr.setName(product.getName());			
			pr.setQuantity(product.getQuantity());
			pr.setPrice(product.getPrice());
			pr.setCategory(product.getCategory());
			return productService.save(pr);
		}).get();
		return product;
		 
	}
	@GetMapping("/{name}/find")
	public List<Product> findByName(@PathVariable(name = "name") String name){
		return productService.findProductsByNameContaining(name);
	}
	
}

