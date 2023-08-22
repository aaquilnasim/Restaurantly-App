package com.restaurant.service;

import java.util.ArrayList;
import java.util.Optional;

import com.restaurant.model.Menu;

public interface IMenuService {

	ArrayList<Menu> getAllMenu();
	Optional<Menu> findById(int id);
	String addMenu(Menu m);
	String updateMenu(Menu m,int id);
	Optional<Menu> deleteMenu(int id);
	Optional<Menu>searchByPrefer(String preference);
	
	
}
