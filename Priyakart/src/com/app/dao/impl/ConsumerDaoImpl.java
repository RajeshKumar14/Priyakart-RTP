package com.app.dao.impl;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.app.client.RestClient;
import com.app.dao.IConsumerDao;
import com.app.model.Consumer;
import com.app.util.JsonUtil;

@Repository
public class ConsumerDaoImpl implements IConsumerDao{
	
	@Override
	public String saveConsumer(Consumer cons) {
		
		//1.convert obj to json
		 String json=JsonUtil.convertObjToJson(cons);
			
		//2.get response msg back
		  return RestClient.connectToProviderToSaveConsumer(json);
	}

	@Override
	public Consumer getConsumerByUmailAndPwd(String consEmail, String Pwd) {
		
		//get response msg back
				Consumer consObj=null;
				String json= RestClient.connectToProviderToLoginConsumer(consEmail, Pwd);
				if(json!=null)
				consObj=(Consumer)JsonUtil.convertJsonToObj(json, Consumer.class);
			  return consObj;
	}
	@Override
	public Consumer getConsumerById(int consId) {
		Consumer consObj=null;
		String json=RestClient.connectToProviderToViewConsumerByConsumerId(consId);
		if(json!=null)
			consObj=(Consumer)JsonUtil.convertJsonToObj(json, Consumer.class);
		  return consObj;		
	  }

	@Override
	public List<Consumer> getAllConsumer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteConsById(int consId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCons(Consumer cons) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isConsEmailExist(String consEmail) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Consumer getConsObByEmailId(String emailId) {
		// TODO Auto-generated method stub
		return null;
	}
}
