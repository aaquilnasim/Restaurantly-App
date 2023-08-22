package com.restaurant.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.restaurant.model.Common;

public interface ICommonService {
	public List<Common> findAll();
	public Optional<Common> getByDish(int dishID);
	

}
