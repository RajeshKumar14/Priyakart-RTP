package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IAddressDao;
import com.app.model.Address;
import com.app.service.IAddressService;

@Service
public class AddressServiceImpl implements IAddressService{

	@Autowired
	private IAddressDao dao;
	
	@Override
	public Address getAddressById(int addrId) {
		return dao.getAddressById(addrId);
	}
	
	@Override
	public void updateAddress(Address addr) {
		dao.updateAddress(addr);
		
	}
}
