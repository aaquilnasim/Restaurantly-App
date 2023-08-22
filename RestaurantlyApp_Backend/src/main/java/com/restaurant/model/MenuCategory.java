package com.restaurant.model;

public class MenuCategory {
	private int menuID;
	private int categoryID;
	private int displayOrder;
	

	public MenuCategory(int menuID, int categoryID, int displayOrder) {
		super();
		this.menuID = menuID;
		this.categoryID = categoryID;
		this.displayOrder = displayOrder;
	}

	public MenuCategory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getMenuID() {
		return menuID;
	}

	public void setMenuID(int menuID) {
		this.menuID = menuID;
	}

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	public int getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(int displayOrder) {
		this.displayOrder = displayOrder;
	}

	
}

