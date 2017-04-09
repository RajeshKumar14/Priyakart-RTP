package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ISellerDao;
import com.app.model.Seller;
import com.app.service.ISellerService;

@Service
public class SellerServiceImpl implements ISellerService{

	@Autowired
	private ISellerDao dao;
	
	@Override
	public String saveSeller(Seller seller) {
		return dao.saveSeller(seller);
	}
	
	@Override
	public Seller getSellerByUmailAndPwd(String sellerEmail, String Pwd) {
		
		return dao.getSellerByUmailAndPwd(sellerEmail, Pwd);
	}
	@Override
	public Seller getSellerById(int sellerId) {
		return dao.getSellerById(sellerId);
	}

	@Override
	public void updateSeller(Seller seller) {
		dao.updateSeller(seller);
	}

	@Override
	public boolean isSellerEmailExist(String sellerEmail) {
		return dao.isSellerEmailExist(sellerEmail);
	}

	@Override
	public Seller getSellerObByEmailId(String emailId) {
		return dao.getSellerObByEmailId(emailId);
	}

	@Override
	public void deleteSellerById(int sellerId) {
		dao.deleteSellerById(sellerId);
		
	}
	@Override
	public String changeSellerPwd(int sellerId, String oldPwd, String newPwd) {
		return dao.changeSellerPwd(sellerId, oldPwd, newPwd);
	}
	
}
