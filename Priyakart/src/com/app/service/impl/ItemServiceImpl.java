package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IItemDao;
import com.app.model.Item;
import com.app.service.IItemService;
@Service
public class ItemServiceImpl implements IItemService{
	
	@Autowired
	private IItemDao dao;

	@Override
	public String saveItem(Item item) {
		
		return dao.saveItem(item);
	}
	@Override
	public Item getItemById(int itemId) {
		return dao.getItemById(itemId);
	}
	@Override
	public List<Item> getAllItemInList() {
		return dao.getAllItemInList();
	}
	
	@Override
	public List<Item> getAllItemBySellerId(int sellerId) {
		return dao.getAllItemBySellerId(sellerId);
	}
	@Override
	public String getAllItemInString() {
	    return dao.getAllItemInString();
	}
	@Override
	public void updateItem(Item item) {
		dao.updateItem(item);
	}
	@Override
	public void deleteItemById(int itemId) {
		dao.deleteItemById(itemId);
	}
	@Override
	public boolean isItemExist(String itemName) {
		return dao.isItemExist(itemName);
	}
}
