package com.restaurant.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.model.Category;
import com.restaurant.repository.CategoryRepository;

@Service
public class CategoryService implements ICategoryService{
	
	@Autowired
	CategoryRepository categoryrepository;

	@Override
	public ArrayList<Category> getAllCategory() {
		// TODO Auto-generated method stub
		return categoryrepository.getAllCategory();
	}

	@Override
	public Optional<Category> findById(int id) {
		// TODO Auto-generated method stub
		return categoryrepository.findById(id);
	}

	@Override
	public String addCategory(Category c) {
		categoryrepository.addCategory(c);
		// TODO Auto-generated method stub
		return "New Category Added!!";
	}

	@Override
	public String updateCategory(Category c, int id) {
		categoryrepository.updateCategory(c, id);
		// TODO Auto-generated method stub
		return "Category Updated !!";
	}

	@Override
	public Optional<Category> deleteCategory(int id) {
		// TODO Auto-generated method stub
		Optional<Category> deleteCategory=null;
		deleteCategory=categoryrepository.deleteCategory(id);
		return deleteCategory;
	}

	@Override
	public Optional<Category> searchByPrefer(String preference) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
