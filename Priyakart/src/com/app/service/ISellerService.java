package com.app.service;

import com.app.model.Seller;

public interface ISellerService {
	
	    public String saveSeller(Seller seller);
	    public Seller getSellerByUmailAndPwd(String sellerEmail,String Pwd);
	    public Seller getSellerById(int sellerId);
		public void updateSeller(Seller seller);
		public boolean isSellerEmailExist(String sellerEmail);
		public Seller getSellerObByEmailId(String emailId);
		public void deleteSellerById(int sellerId);
		public String changeSellerPwd(int sellerId,String oldPwd,String newPwd);
	
}
