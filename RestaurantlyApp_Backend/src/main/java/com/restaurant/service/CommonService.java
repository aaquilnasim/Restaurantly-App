package com.restaurant.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.model.Common;
import com.restaurant.repository.CommonRepository;

@Service
public class CommonService implements ICommonService {
	@Autowired
	CommonRepository commonRepository;
	public CommonService() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public List<Common> findAll() {
		// TODO Auto-generated method stub
		return commonRepository.getAll();
	}
	@Override
	public Optional<Common> getByDish(int dishID) {
		// TODO Auto-generated method stub
		return commonRepository.findbyId(dishID);
	}

	

}