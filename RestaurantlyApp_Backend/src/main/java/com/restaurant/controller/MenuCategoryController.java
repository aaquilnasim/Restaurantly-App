package com.restaurant.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.model.Category;
import com.restaurant.service.IMenuCategoryService;

@RequestMapping("/api")
@RestController

public class MenuCategoryController {
	@Autowired
	IMenuCategoryService menuCategoryService;
	@GetMapping("/allcategories/{menuID}")
	public List<Category> getAllCatByMenuId(@PathVariable int menuID){
	return menuCategoryService.getAllCatByMenuId(menuID);
	}
}
