package com.app.dao.impl;
import org.springframework.stereotype.Repository;

import com.app.client.RestClient;
import com.app.dao.IAddressDao;
import com.app.model.Address;
import com.app.model.Consumer;
import com.app.util.JsonUtil;

@Repository
public class AddressDaoImpl implements IAddressDao{
	
	@Override
	public Address getAddressById(int addrId) {
		Address addrObj=null;
		String json=RestClient.connectToProviderToViewConsumerByConsumerId(addrId);
		if(json!=null)
			addrObj=(Address)JsonUtil.convertJsonToObj(json, Consumer.class);
		  return addrObj;	
	}
	@Override
	public void updateAddress(Address addr) {
		  String json=null;
			//1.convert obj to json
			 if(addr!=null){
			  json=JsonUtil.convertObjToJson(addr);
			//2.get response msg back
			  RestClient.connectToProviderToUpdateAddress(json);
			 }
	}
}
