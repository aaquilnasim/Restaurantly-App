package com.restaurant.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.restaurant.model.Category;

public interface IMenuCategoryService {

	ArrayList<Category> getAllCatByMenuId(int menuID);

}
