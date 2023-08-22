package com.restaurant.service;

import java.util.ArrayList;
import java.util.Optional;

import com.restaurant.model.Dish;
import com.restaurant.model.Menu;

public interface IDishService {
	
	ArrayList<Dish> getAllDishes();
	Optional<Dish> findById(int id);
	String addDish(Dish m);
	String updateDish(Dish m,int id);
	Optional<Dish> deleteDish(int id);
	Optional<Dish>searchByPrefer(String preference);

}
