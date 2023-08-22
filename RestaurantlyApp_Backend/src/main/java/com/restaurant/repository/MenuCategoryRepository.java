package com.restaurant.repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import java.sql.ResultSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.restaurant.model.MenuCategory;

@Repository
public class MenuCategoryRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private org.springframework.jdbc.core.RowMapper<MenuCategory> rowMapper = (ResultSet rs, int rowNum) ->{
		MenuCategory menuCategory = new MenuCategory();
			menuCategory.setMenuID(rs.getInt(1));
			menuCategory.setCategoryID(rs.getInt(2));
			menuCategory.setDisplayOrder(rs.getInt(3));
			return menuCategory;
			};
	public List<MenuCategory> getAllCatByMenuId(int menuId) {
	String sql="SELECT * FROM menucategory WHERE MenuID=?";
	return jdbcTemplate.query(sql, rowMapper , menuId);
	}
}
