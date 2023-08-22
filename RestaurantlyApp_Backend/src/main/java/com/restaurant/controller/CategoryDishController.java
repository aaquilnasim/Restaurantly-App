package com.restaurant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.exception.ResourceNotFoundException;
import com.restaurant.model.Dish;
import com.restaurant.service.ICategoryDishService;


@RequestMapping("/api")
@RestController
public class CategoryDishController {
	@Autowired
	ICategoryDishService categoryDishService;
	@GetMapping("/alldishes/{categoryID}")
	public List<Dish>getAllCatByCategoryId(@PathVariable int categoryID) throws ResourceNotFoundException{
		return categoryDishService.getAllDishByCategoryId(categoryID);
		}
}