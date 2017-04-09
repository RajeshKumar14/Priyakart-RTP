package com.app.util;

import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

import com.app.model.Item;

public class JsonUtil {

	/**
	 * This code is used to
	 * convert object to json string
	 * input is any object and
	 * output is json String
	 * 
	 */
	
	public static String convertObjToJson(Object ob){
		String json=null;
		try {
			
			ObjectMapper om=new ObjectMapper();
			json=om.writeValueAsString(ob);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return json;
	   }
	
	/**
	 * This Method is used to convert given json string
	 * to given class type object
	 * it uses JACKSON conversion  
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static  Object convertJsonToObj(String json,Class cls){
		Object ob=null;
		try {
			ObjectMapper om=new ObjectMapper();
			 ob=om.readValue(json, cls);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ob;
	  }
	

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static  List<Item> convertJsonToListObj(String json,Class cls){
		List<Item> listObj=null;
		try {
			ObjectMapper om=new ObjectMapper();
			 listObj=om.readValue(json, cls);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listObj;
	  }
	
	
}
