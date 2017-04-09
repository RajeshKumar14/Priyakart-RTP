package com.app.service;

import java.util.List;

import com.app.model.Item;

public interface IItemService {
	
    public String saveItem(Item item);
	
    public List<Item> getAllItemInList();
    
    public List<Item> getAllItemBySellerId(int sellerId);
	
	public String getAllItemInString();
	
    public void deleteItemById(int itemId);
	
	public Item getItemById(int itemId);
	
	public void updateItem(Item item);
	
	public boolean isItemExist(String itemName);


}
