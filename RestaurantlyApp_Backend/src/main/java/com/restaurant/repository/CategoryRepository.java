package com.restaurant.repository;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import com.restaurant.model.Category;


@Repository
public class CategoryRepository {
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	private org.springframework.jdbc.core.RowMapper<Category> rowMapper= (ResultSet rs, int rowNum)->{
		Category cobj=new Category();
		cobj.setCategoryID(rs.getInt(1));
		cobj.setCategoryName(rs.getString(2));
		cobj.setCategoryDescription(rs.getString(3));
		cobj.setCategoryImage(rs.getString(4));
		
		return cobj;
		};
		
		public ArrayList<Category> getAllCategory(){
			String sql="select * from category";
			return (ArrayList<Category>) jdbctemplate.query(sql, rowMapper);
		}
	
		public Optional<Category> findById(int id){
			String sql="select * from category where categoryID='"+id+"' ";
			return jdbctemplate.query(sql, rowMapper).stream().findFirst();
		}
		
		public void addCategory(Category c) {
			String query="insert into category values( '"+c.getCategoryID()+"','"+c.getCategoryName()+"','"+c.getCategoryDescription()+"','"+c.getCategoryImage()+"')";
			jdbctemplate.update(query);
		}
		
		public int updateCategory(Category c,int id) {
			return jdbctemplate.update("update Category set CategoryName= '"+ c.getCategoryName()+ "', categoryDescription= '"+ c.getCategoryDescription()+"', CategoryImage= '"+c.getCategoryImage()+"' where CategoryID = '"+id+"';");
		}
		
		public Optional<Category> deleteCategory(int id) {
			Optional<Category> deleteCategory=findById(id);
			String sql="delete from Category where CategoryID='"+id+"' ";
			jdbctemplate.execute(sql);
			return deleteCategory;
		}
}
