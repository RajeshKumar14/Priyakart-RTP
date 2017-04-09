package com.app.service;

import com.app.model.Address;

public interface IAddressService {
	
	 public Address getAddressById(int addrId);
	 public void updateAddress(Address addr);
	
}
