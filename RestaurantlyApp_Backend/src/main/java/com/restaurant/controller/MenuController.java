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
import com.restaurant.model.Menu;
import com.restaurant.service.MenuService;


@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api")
@RestController
public class MenuController {
	
	@Autowired
	MenuService menuservice;
	
	@GetMapping("/menuitems")
	ArrayList<Menu> getAllMenu(){
		return menuservice.getAllMenu();
	}
	
	@GetMapping("/menuitems/{id}")
	Optional<Menu>findById(@PathVariable int id) throws ResourceNotFoundException{
		return menuservice.findById(id);
	}
	
	@PostMapping("/menuitem")
	Menu addMenu(@RequestBody Menu m) {
		menuservice.addMenu(m);
		return m;
	}
	
	@PutMapping("/menuitems/{id}")
	Menu updateMenu(@RequestBody Menu m,@PathVariable int id) {
		menuservice.updateMenu(m, id);
		return m;
	}
	
	@DeleteMapping("/menuitems/{id}")
	Optional<Menu> deleteMenu(@PathVariable int id) {
		return menuservice.deleteMenu(id);
		
	}

}
