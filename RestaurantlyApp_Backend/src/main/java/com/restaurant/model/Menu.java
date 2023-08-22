package com.restaurant.model;

public class Menu {
	private int menuID;
	private String menuName;
	private String menuDescription;
	private String menuImage;
	
	public Menu(int menuID, String menuName, String menuDescription, String menuImage) {
		super();
		this.menuID = menuID;
		this.menuName = menuName;
		this.menuDescription = menuDescription;
		this.menuImage = menuImage;
	}

	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getMenuID() {
		return menuID;
	}

	public void setMenuID(int menuID) {
		this.menuID = menuID;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuDescription() {
		return menuDescription;
	}

	public void setMenuDescription(String menuDescription) {
		this.menuDescription = menuDescription;
	}

	public String getMenuImage() {
		return menuImage;
	}

	public void setMenuImage(String menuImage) {
		this.menuImage = menuImage;
	}
	
	

	
}
