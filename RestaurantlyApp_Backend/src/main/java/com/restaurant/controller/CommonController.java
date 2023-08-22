package com.restaurant.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.exception.ResourceNotFoundException;
import com.restaurant.model.Common;
import com.restaurant.service.ICommonService;

@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class CommonController {

	@Autowired
	ICommonService commonService;
	
	@GetMapping("/common")
	List<Common> all()
	{
		return commonService.findAll();
	}
	
	@GetMapping("/common/{dishID}")
	Optional<Common> menuById(@PathVariable int dishID) throws ResourceNotFoundException
	{
		return commonService.getByDish(dishID);	
	}
	public CommonController() {
		// TODO Auto-generated constructor stub
	}

}