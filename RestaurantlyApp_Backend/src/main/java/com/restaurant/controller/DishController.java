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

import com.restaurant.exception.ResourceNotFoundException;
import com.restaurant.model.Dish;
import com.restaurant.service.DishService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")

public class DishController {
	@Autowired
	DishService dishservice;
	
	@GetMapping("/dishitems")
	ArrayList<Dish> getAllMenu(){
		return dishservice.getAllDishes();
	}
	
	@GetMapping("/dishitems/{id}")
	Optional<Dish> DishfindById(@PathVariable int id) throws ResourceNotFoundException{
		return dishservice.findById(id);
	}
	
	@PostMapping("/dishitem")
	Dish addMenu(@RequestBody Dish d) {
		dishservice.addDish(d);
		return d;
	}
	
	@PutMapping("/dishitems/{id}")
	Dish updateMenu(@RequestBody Dish d,@PathVariable int id) {
		dishservice.updateDish(d, id);
		return d;
	}
	
	@DeleteMapping("/dishitems/{id}")
	Optional<Dish> deleteMenu(@PathVariable int id) {
		return dishservice.deleteDish(id);
		
	}

}
