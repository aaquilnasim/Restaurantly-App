package com.restaurant.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.model.Category;
import com.restaurant.model.MenuCategory;
import com.restaurant.repository.CategoryRepository;
import com.restaurant.repository.MenuCategoryRepository;

@Service
public class MenuCategoryService implements IMenuCategoryService{
	@Autowired
	MenuCategoryRepository menuCategoryRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	List<Category> categories = new ArrayList<>();
	@Override
	public ArrayList<Category> getAllCatByMenuId(int menuId) {
		// get all category id with the given menu id from menucategory table
		List<MenuCategory> categoriesByMenuId = menuCategoryRepository.getAllCatByMenuId(menuId);
		// getting details of each category
		for(MenuCategory categoryByMenuId: categoriesByMenuId) {
		Optional<Category> category = categoryRepository.findById(categoryByMenuId.getCategoryID());
		categories.add(new Category(category.get().getCategoryID(),category.get().getCategoryName(),
				category.get().getCategoryDescription(),category.get().getCategoryImage()));
	}
	return (ArrayList<Category>) categories;
	}
}
