package com.restaurant.model;

public class Dish {
	private int dishID;
	private String dishName;
	private String dishDescription;
	private double dishPrice;
	private String dishImage;
	private String nature;
	
	

	public Dish(int dishID, String dishName, String dishDescription, double dishPrice, String dishImage,
			String nature) {
		super();
		this.dishID = dishID;
		this.dishName = dishName;
		this.dishDescription = dishDescription;
		this.dishPrice = dishPrice;
		this.dishImage = dishImage;
		this.nature = nature;
	}

	public Dish() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getDishID() {
		return dishID;
	}

	public void setDishID(int dishID) {
		this.dishID = dishID;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public String getDishDescription() {
		return dishDescription;
	}

	public void setDishDescription(String dishDescription) {
		this.dishDescription = dishDescription;
	}

	public double getDishPrice() {
		return dishPrice;
	}

	public void setDishPrice(double dishPrice) {
		this.dishPrice = dishPrice;
	}

	public String getDishImage() {
		return dishImage;
	}

	public void setDishImage(String dishImage) {
		this.dishImage = dishImage;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}
	
	

}
