package com.restaurant.model;

public class Common {
	private String menuName;
	private String CategoryName;
	private String DishName;
	private String dishImage; 
	private double dishPrice;
	private String dishNature;
	private String dishDescription;
	
	public Common() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Common(String menuName, String categoryName, String dishName, String dishImage, double dishPrice,
			String dishNature, String dishDescription) {
		super();
		this.menuName = menuName;
		CategoryName = categoryName;
		DishName = dishName;
		this.dishImage = dishImage;
		this.dishPrice = dishPrice;
		this.dishNature = dishNature;
		this.dishDescription = dishDescription;
	}

	
	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

	public String getDishName() {
		return DishName;
	}

	public void setDishName(String dishName) {
		DishName = dishName;
	}

	public String getDishImage() {
		return dishImage;
	}

	public void setDishImage(String dishImage) {
		this.dishImage = dishImage;
	}

	public double getDishPrice() {
		return dishPrice;
	}

	public void setDishPrice(double dishPrice) {
		this.dishPrice = dishPrice;
	}

	public String getDishNature() {
		return dishNature;
	}

	public void setDishNature(String dishNature) {
		this.dishNature = dishNature;
	}

	public String getDishDescription() {
		return dishDescription;
	}

	public void setDishDescription(String dishDescription) {
		this.dishDescription = dishDescription;
	}
	
	
	
	
	
	

}
