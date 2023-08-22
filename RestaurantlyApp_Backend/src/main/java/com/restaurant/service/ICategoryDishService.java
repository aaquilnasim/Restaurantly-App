package com.restaurant.service;

import java.util.List;

import com.restaurant.model.Dish;

public interface ICategoryDishService {
	List<Dish> getAllDishByCategoryId(int _categoryID);
}

