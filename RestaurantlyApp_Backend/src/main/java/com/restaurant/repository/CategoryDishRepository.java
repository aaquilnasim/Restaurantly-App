package com.restaurant.repository;

import java.sql.ResultSet;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.restaurant.model.CategoryDish;

@Repository
public class CategoryDishRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public CategoryDishRepository() {

	}


	private org.springframework.jdbc.core.RowMapper<CategoryDish> rowMapper = (ResultSet rs, int rowNum) ->{
		CategoryDish categoryDish = new CategoryDish();
		categoryDish.setCategoryID(rs.getInt(1));
		categoryDish.setDishID(rs.getInt(2));
		return categoryDish;
		};
		public List<CategoryDish> getAllDishByCategoryId(int _categoryID) {
			String sql="SELECT * FROM categorydish WHERE CategoryID=?";
			return jdbcTemplate.query(sql, rowMapper , _categoryID);
	}
}
