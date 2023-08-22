package com.restaurant.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.model.Dish;
import com.restaurant.model.Menu;
import com.restaurant.repository.DishRepository;

@Service
public class DishService implements IDishService{
	
	@Autowired
	DishRepository dishrepository;

	@Override
	public ArrayList<Dish> getAllDishes() {
		// TODO Auto-generated method stub
		return dishrepository.getAllDishes();
	}

	@Override
	public Optional<Dish> findById(int id) {
		// TODO Auto-generated method stub
		return dishrepository.findById(id);
		}

	@Override
	public String addDish(Dish d) {
		dishrepository.addDish(d);
		// TODO Auto-generated method stub
		return "New Dishes Added";
	}

	@Override
	public String updateDish(Dish d, int id) {
		dishrepository.updateDish(d, id);
		// TODO Auto-generated method stub
		return "Dish updated";
	}

	@Override
	public Optional<Dish> deleteDish(int id) {
		// TODO Auto-generated method stub
		Optional<Dish> deleteDish=null;
		deleteDish=dishrepository.deleteDish(id);
		return deleteDish;
	}
	@Override
	public Optional<Dish> searchByPrefer(String preference) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	
	

}
