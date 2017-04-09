package com.app.dao;

import java.util.List;

import com.app.model.Consumer;

public interface IConsumerDao {
	
    public String saveConsumer(Consumer cons);
	public List<Consumer> getAllConsumer();
    public void deleteConsById(int consId);
	public Consumer getConsumerById(int consId);
	public void updateCons(Consumer cons);
	public boolean isConsEmailExist(String consEmail);
	public Consumer getConsObByEmailId(String emailId);
	public Consumer getConsumerByUmailAndPwd(String consEmail,String pwd);
	
}
