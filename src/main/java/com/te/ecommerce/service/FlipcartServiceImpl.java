package com.te.ecommerce.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.te.ecommerce.bean.Admin;
import com.te.ecommerce.bean.Item;
import com.te.ecommerce.dao.FlipcartDaoImpl;



@Service
public class FlipcartServiceImpl implements FlipcartService{

	@Autowired
	FlipcartDaoImpl Dao;
	
	@Override
	public Admin authenticate(Integer id, String password) {
		
		Admin admin = Dao.authenticate(id, password);
		return admin;
	}

	@Override
	public boolean addItem(Item item) {
		boolean result = Dao.addItem(item) ;
		return result;
	}

	@Override
	public boolean removeItem(Integer id) {
		boolean result = Dao.removeItem(id);
		return result;
	}

	@Override
	public Item searchItem(Integer id) {
		Item item = Dao.searchItem(id);
		return item;
	}

	@Override
	public List<Item> getAllItems() {
		List<Item> list = Dao.getAllItems();
		return list;
	}

	@Override
	public boolean updateItem(Item item) {
		boolean result = Dao.updateItem(item);
		return result;
	}

}