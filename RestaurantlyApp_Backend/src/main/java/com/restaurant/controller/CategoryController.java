package com.restaurant.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.model.Category;
import com.restaurant.service.CategoryService;

@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api")
@RestController
public class CategoryController {
	@Autowired
	CategoryService categoryservice;
	
	@GetMapping("/categoryitems")
	ArrayList<Category> getAllCategory(){
		return categoryservice.getAllCategory();
	}
	
	@GetMapping("/categoryitems/{id}")
	Optional<Category> findById(@PathVariable int id){
		return categoryservice.findById(id);
	}
	
	@PostMapping("/categoryitem")
	Category addMenu(@RequestBody Category c) {
		categoryservice.addCategory(c);
		return c;
	}
	
	@PutMapping("/categoryitems/{id}")
	Category updateMenu(@RequestBody Category c,@PathVariable int id) {
		categoryservice.updateCategory(c, id);
		return c;
	}
	
	@DeleteMapping("/categoryitems/{id}")
	Optional<Category> deleteMenu(@PathVariable int id) {
		return categoryservice.deleteCategory(id);
		
	}
}
