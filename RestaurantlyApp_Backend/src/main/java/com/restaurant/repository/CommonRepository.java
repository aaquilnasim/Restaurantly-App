package com.restaurant.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.restaurant.model.Common;

import java.sql.ResultSet;
import java.util.List;
import java.util.Optional;

@Repository
public class CommonRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private org.springframework.jdbc.core.RowMapper<Common> rowMapper = (ResultSet rs, int rowNum) ->{
		Common common = new Common();
		common.setMenuName(rs.getString(1));
		common.setCategoryName(rs.getString(2));
		common.setDishName(rs.getString(3));
		common.setDishImage(rs.getString(4));
		common.setDishPrice(rs.getDouble(5));
		common.setDishNature(rs.getString(6));
		common.setDishDescription(rs.getString(7));
		return common;	
	};
	
	public CommonRepository() {
		// TODO Auto-generated constructor stub
	}

	public List<Common> getAll() {
		
		return jdbcTemplate.query("SELECT m.MenuName, c.CategoryName, d.DishName,d.DishImage,d.DishPrice ,d.Nature,d.DishDescription\r\n"
		+ "FROM Menu m\r\n"
		+ "JOIN MenuCategory mc ON m.MenuID = mc.MenuID\r\n"
		+ "JOIN Category c ON mc.CategoryID = c.CategoryID\r\n"
		+ "JOIN CategoryDish cd ON c.CategoryID = cd.CategoryID\r\n"
		+ "JOIN Dish d ON cd.DishID = d.DishID\r\n"
		+ "GROUP BY m.MenuName, c.CategoryName, d.DishName,d.DishImage,d.DishPrice ,d.Nature,d.DishDescription\r\n"
		+ "ORDER BY m.MenuName, c.CategoryName,d.DishName;", rowMapper);
}
		

	public Optional<Common> findbyId(int _dishID) {
		String sql = "SELECT m.MenuName, c.CategoryName, d.DishName, d.DishImage,d.DishPrice ,d.Nature,d.DishDescription " +
                "FROM Menu m " +
                "JOIN MenuCategory mc ON m.MenuID = mc.MenuID " +
                "JOIN Category c ON mc.CategoryID = c.CategoryID " +
                "JOIN CategoryDish cd ON c.CategoryID = cd.CategoryID " +
                "JOIN Dish d ON cd.DishID = d.DishID " +
                "GROUP BY m.MenuName, c.CategoryName, d.DishName, d.DishImage,d.DishPrice ,d.Nature,d.DishDescription";

		return jdbcTemplate.query(sql, rowMapper).stream().findFirst();
	}
}
