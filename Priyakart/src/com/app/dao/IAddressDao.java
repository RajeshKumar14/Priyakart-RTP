package com.app.dao;

import com.app.model.Address;

public interface IAddressDao {
	
    public Address getAddressById(int addrId);
    public void updateAddress(Address addr);
	
}
