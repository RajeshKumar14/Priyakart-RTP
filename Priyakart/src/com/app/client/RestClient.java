package com.app.client;

import javax.ws.rs.core.MediaType;
import com.app.util.CodecUtil;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class RestClient {
	
	//============Save Seller in Vendor DB=============
	public static String connectToProviderToSaveSeller(String json){
		String url="http://localhost:8084/Online_Shopping_Cart/rest/sellerService/saveSeller";
		String msg=null;
		try {
			Client c=Client.create();
			WebResource r=c.resource(url);

			ClientResponse cr=r.type(MediaType.APPLICATION_JSON).post(ClientResponse.class, json);
			msg=cr.getEntity(String.class);

		   } catch (Exception e) {e.printStackTrace();}
		return msg;
	  }
	//============Update Seller in Vendor DB=============
		public static String connectToProviderToUpdateSeller(String json){
			String url="http://localhost:8084/Online_Shopping_Cart/rest/sellerService/updateSeller";
			String msg=null;
			try {
				Client c=Client.create();
				WebResource r=c.resource(url);
				ClientResponse cr=r.type(MediaType.APPLICATION_JSON).post(ClientResponse.class, json);
				msg=cr.getEntity(String.class);

			   } catch (Exception e) {e.printStackTrace();}
			return msg;
		  }
	//============Update Seller in Vendor DB=============
				public static String connectToProviderToUpdateAddress(String json){
					String url="http://localhost:8084/Online_Shopping_Cart/rest/sellerService/updateAddress";
					String msg=null;
					try {
						Client c=Client.create();
						WebResource r=c.resource(url);
						ClientResponse cr=r.type(MediaType.APPLICATION_JSON).post(ClientResponse.class,json);
						msg=cr.getEntity(String.class);

					   } catch (Exception e) {e.printStackTrace();}
					return msg;
				  }
	//============Change Seller Password in Vendor DB=============
	   public static String connectToProviderToChangeSellerPassword(int sellerId,String oldPwd,String newPwd)
	            {
					String url="http://localhost:8084/Online_Shopping_Cart/rest/sellerService/changeSellerPwd";
					String msg=null;
					try {
						Client c=Client.create();
						WebResource r=c.resource(url);
						ClientResponse cr=r.type(MediaType.APPLICATION_JSON)
								.header("sellerId",sellerId)
								.header("oldPwd", CodecUtil.doEncode(oldPwd))
								.header("newPwd",CodecUtil.doEncode(newPwd))
								.post(ClientResponse.class);
						msg=cr.getEntity(String.class);
						
					   } catch (Exception e) {e.printStackTrace();}
					return msg;
				  }
	//============Login Seller in Vendor DB=============
	public static String connectToProviderToLoginSeller(String sellerEmail,String Pwd){
		String url="http://localhost:8084/Online_Shopping_Cart/rest/sellerService/loginSeller";
		String un=sellerEmail;
		String pwd=Pwd;
		String json=null;
		try {
			Client c=Client.create();
			WebResource r=c.resource(url);

			ClientResponse cr=r.type(MediaType.APPLICATION_JSON)
								.header("username",un)
								.header("password", CodecUtil.doEncode(pwd))
								.post(ClientResponse.class);
			json=cr.getEntity(String.class);
		   } catch (Exception e) {
			e.printStackTrace();
		   }
		return json;
	  }
		
	//============Save Consumer in Vendor DB=============
		public static String connectToProviderToSaveConsumer(String json){
			String url="http://localhost:8084/Online_Shopping_Cart/rest/consumerService/saveConsumer";
			String msg=null;
			try {
				Client c=Client.create();
				WebResource r=c.resource(url);

				ClientResponse cr=r.type(MediaType.APPLICATION_JSON).post(ClientResponse.class, json);
				msg=cr.getEntity(String.class);

			   } catch (Exception e) {e.printStackTrace();}
			return msg;
		  }
		
	//============Login Consumer in Vendor DB=============
		public static String connectToProviderToLoginConsumer(String consEmail,String Pwd){
			String url="http://localhost:8084/Online_Shopping_Cart/rest/consumerService/loginConsumer";
			String un=consEmail;
			String pwd=Pwd;
			String json=null;
			try {
				Client c=Client.create();
				WebResource r=c.resource(url);

				ClientResponse cr=r.type(MediaType.APPLICATION_JSON)
									.header("username",un)
									.header("password", CodecUtil.doEncode(pwd))
									.post(ClientResponse.class);
				json=cr.getEntity(String.class);

			   } catch (Exception e) {
				e.printStackTrace();
			   }
			return json;
		  }
	
//======================Item Services=========================================
		
		     //============Save Item in Vendor DB=============
		public static String connectToProviderToSaveItem(String json ){
			String url="http://localhost:8084/Online_Shopping_Cart/rest/itemService/saveItem";
			String un="rajeshtnb14@gmail.com";
			String pwd="6a439d";
			String token="c3f43e60";
			String msg=null;
			try {
				Client c=Client.create();
				WebResource r=c.resource(url);

				ClientResponse cr=r.type(MediaType.APPLICATION_JSON)
									.header("user",un)
									.header("password", CodecUtil.doEncode(pwd))
									.header("token", CodecUtil.doEncode(token))
									.post(ClientResponse.class, json);
				msg=cr.getEntity(String.class);

			} catch (Exception e) {
				e.printStackTrace();
			}
			return msg;
		}
		
		     //============ View  item by sellerId in Vendor DB=============
		public static String connectToProviderToViewItemBySellerId(int sellerId ){
			String url="http://localhost:8084/Online_Shopping_Cart/rest/itemService/viewItemBySellerId";
			String msg=null;
			try {
				Client c=Client.create();
				WebResource r=c.resource(url);

				ClientResponse cr=r.type(MediaType.APPLICATION_JSON)
						.header("sellerId",sellerId)
						.post(ClientResponse.class);
				msg=cr.getEntity(String.class);

			} catch (Exception e) {
				e.printStackTrace();
			}
			return msg;
		}
		
		 //============ View  item by itemId in Vendor DB=============
		public static String connectToProviderToViewItemByItemId(int itemId ){
			String url="http://localhost:8084/Online_Shopping_Cart/rest/itemService/viewItemByItemId";
			String json=null;
			try {
				Client c=Client.create();
				WebResource r=c.resource(url);

				ClientResponse cr=r.type(MediaType.APPLICATION_JSON)
						.header("itemId",itemId)
						.post(ClientResponse.class);
				json=cr.getEntity(String.class);

			} catch (Exception e) {
				e.printStackTrace();
			}
			return json;
		}
		     //============ View all item in Vendor DB=============
		public static String connectToProviderToViewAllItem(){
			String url="http://localhost:8084/Online_Shopping_Cart/rest/itemService/viewAllItem";
			String json=null;
			try {
				Client c=Client.create();
				WebResource r=c.resource(url);
				ClientResponse cr=r.type(MediaType.APPLICATION_JSON).post(ClientResponse.class);
				json=cr.getEntity(String.class);

			} catch (Exception e) {
				e.printStackTrace();
			}
			return json;
		} 
		
		/*@SuppressWarnings("unchecked")
		public static List<Item> connectToProviderToViewAllItem(){
			String url="http://localhost:8084/Online_Shopping_Cart/rest/itemService/viewAllItem";
			List<Item> listObj=null;
			try {
				Client c=Client.create();
				WebResource r=c.resource(url);
				ClientResponse cr=r.type(MediaType.APPLICATION_JSON).post(ClientResponse.class);
				listObj=(List<Item>) cr.getEntity(Item.class);

			} catch (Exception e) {
				e.printStackTrace();
			}
			return listObj;
		} */
		
//========================Seller===============================
		//==============Get Seller by sellerId in vendor DB====
		public static String connectToProviderToViewSellerBySellerId(int sellerId ){
			String url="http://localhost:8084/Online_Shopping_Cart/rest/sellerService/viewSellerBySellerId";
			String json=null;
			try {
				Client c=Client.create();
				WebResource r=c.resource(url);

				ClientResponse cr=r.type(MediaType.APPLICATION_JSON)
						.header("sellerId",sellerId)
						.post(ClientResponse.class);
				json=cr.getEntity(String.class);

			} catch (Exception e) {
				e.printStackTrace();
			}
			return json;
		}
//========================Consumer===============================
	    //==============Get Consumer by consId in vendor DB====
				public static String connectToProviderToViewConsumerByConsumerId(int consId ){
					String url="http://localhost:8084/Online_Shopping_Cart/rest/consumerService/viewConsumerByConsId";
					String json=null;
					try {
						Client c=Client.create();
						WebResource r=c.resource(url);

						ClientResponse cr=r.type(MediaType.APPLICATION_JSON)
								.header("consId",consId)
								.post(ClientResponse.class);
						json=cr.getEntity(String.class);

					} catch (Exception e) {
						e.printStackTrace();
					}
					return json;
				}
}
