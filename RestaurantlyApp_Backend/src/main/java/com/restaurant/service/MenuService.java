package com.restaurant.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.model.Menu;
import com.restaurant.repository.MenuRepository;

@Service
public class MenuService implements IMenuService{
	
	@Autowired
	MenuRepository menurepository;

	public ArrayList<Menu> getAllMenu() {
		// TODO Auto-generated method stub
		return menurepository.getAllMenu();
	}

	@Override
	public Optional<Menu> findById(int id) {
		// TODO Auto-generated method stub
		return menurepository.findById(id);
	}

	@Override
	public String addMenu(Menu m) {
		menurepository.addMenu(m);
		// TODO Auto-generated method stub
		return "New Menu Added !!";
	}

	@Override
	public String updateMenu(Menu m, int id) {
		menurepository.updateMenu(m,id);
		return "Menu Updated !!";
		// TODO Auto-generated method stub
	}

	@Override
	public Optional<Menu> deleteMenu(int id) {
		// TODO Auto-generated method stub
		Optional<Menu> deleteMenu=null;
		deleteMenu=menurepository.deleteMenu(id);
		return deleteMenu;
	}

	@Override
	public Optional<Menu> searchByPrefer(String preference) {
		return null;
		// TODO Auto-generated method stub
		
	}

}
