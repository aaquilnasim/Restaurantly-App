package com.restaurant.model;

public class CategoryDish {
	private int categoryID;
	private int dishID;
	
	public CategoryDish(int categoryID, int dishID) {
		super();
		this.categoryID = categoryID;
		this.dishID = dishID;
	}

	public CategoryDish() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	public int getDishID() {
		return dishID;
	}

	public void setDishID(int dishID) {
		this.dishID = dishID;
	}
	

}
