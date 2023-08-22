package com.restaurant.service;

import java.util.ArrayList;
import java.util.Optional;

import com.restaurant.model.Category;


public interface ICategoryService {
	ArrayList<Category> getAllCategory();
	Optional<Category> findById(int id);
	String addCategory(Category c);
	String updateCategory(Category c,int id);
	Optional<Category> deleteCategory(int id);
	Optional<Category>searchByPrefer(String preference);
	
}
