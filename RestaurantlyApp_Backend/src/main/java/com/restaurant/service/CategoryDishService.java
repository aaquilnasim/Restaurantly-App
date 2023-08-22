package com.restaurant.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.model.CategoryDish;
import com.restaurant.model.Dish;
import com.restaurant.repository.CategoryDishRepository;
import com.restaurant.repository.DishRepository;

@Service
public class CategoryDishService implements ICategoryDishService {
	@Autowired
	CategoryDishRepository categoryDishRepository;

	@Autowired
	DishRepository dishRepository;

	@Override
	public List<Dish> getAllDishByCategoryId(int _categoryID) {
		List<Dish> dishes = new ArrayList<>();
		List<CategoryDish> dishesByCategoryId = categoryDishRepository.getAllDishByCategoryId(_categoryID);
		System.out.println(dishesByCategoryId+"--------------------");
		for(CategoryDish dishByCategoryId: dishesByCategoryId) {
			Optional<Dish> dish = dishRepository.findById(dishByCategoryId.getDishID());
			dishes.add(new Dish(dish.get().getDishID(),dish.get().getDishName(),
					dish.get().getDishDescription(),dish.get().getDishPrice(),dish.get().getDishImage(),
					dish.get().getNature()));
			}
		return dishes;
		}
}
