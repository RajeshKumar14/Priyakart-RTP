package com.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Address;
import com.app.model.Location;
import com.app.model.Seller;
import com.app.service.IAddressService;
import com.app.service.ILocationService;
import com.app.service.ISellerService;

@Controller
public class SellerController {

	@Autowired
	private ISellerService service;
	@Autowired
	private IAddressService addrService;
	@Autowired
	private ILocationService locService;
	
	//=====Seller Hub=======
	@RequestMapping("/sells")
	public String showSellsHomePage()
	   {
		return "sellsHome";
	   }
	@RequestMapping("/pricing")
	public String showSellerPricingPage()
	   {
		return "sellsPricing";
	   }
	@RequestMapping("/faq")
	 public String showSellerFaqPage()
	   {
		return "sellsFAQ";
	   }
	@RequestMapping("/benefits")
	public String showSellerBenefitsPage()
	  {
	    return "sellsBenifits";
	  }
	//=========Seller Dashboard======
	@RequestMapping("/sellerDash")
	public String showSellerDashboardPage()
	{
		return "SellerDashboard";
	}
	
	//=========Seller================
	
	@RequestMapping("/seller")
	public String showSellerHomePage()
	  {
	    return "SellerDashboard";
	  }
	@RequestMapping("/regSeller")
	public String showSellerRegPage(ModelMap map)
	  {
		List<Location> locList=locService.getAllLocations();
		map.addAttribute("locListObj",locList);
	    return "SellerReg";
	  }
	//========Seller Profile========
	
	@RequestMapping("/sellerPro")
	public String showSellerProfile(@RequestParam("sellerId")int sellerId,ModelMap map)
	  {
		Seller seller=service.getSellerById(sellerId);
		map.addAttribute("sellerObject",seller);
	   return "sellerProfile";
      }
	@RequestMapping("/sellerSett")
	
	public String showSellerSetting(@RequestParam("sellerId")int sellerId,ModelMap map)
	  {
		Seller seller=service.getSellerById(sellerId);
		map.addAttribute("sellerObject",seller);
	    return "sellerSetting";
	  }
	@RequestMapping("/sellerChangePwd")
	public String showSellerChangePassword(@RequestParam("sellerId")int sellerId,ModelMap map){
		Seller seller=new Seller();
		seller=service.getSellerById(sellerId);
		map.addAttribute("sellerObject",seller);
	    return "sellerChangePassword";
	
	  }
	@RequestMapping("/sellerChangePassword")
	public String showSellerChangePassword(@RequestParam("sellerId")int sellerId,
			                               @RequestParam("oldPwd")String oldPwd,
		                                   @RequestParam("newPwd")String newPwd,ModelMap map){
		service.changeSellerPwd(sellerId, oldPwd, newPwd);
			Seller seller=new Seller();
		seller=service.getSellerById(sellerId);
		map.addAttribute("sellerObject",seller);
	    return "sellerChangePassword";
	
	  }
	/**
	 * Send data to the Rest Client
	 * 1.read seller from Container using ModelAttribute
	 */
	@RequestMapping(value="/insertSeller",method=RequestMethod.POST)
	public String saveSellerData(@ModelAttribute("Seller")Seller seller,ModelMap map){
	   String msg=service.saveSeller(seller);
	    map.addAttribute("msg", msg);
		return "SellerReg";
      }	
	
	@RequestMapping("/updateSeller")
	public String showUpdateSellerPage(@ModelAttribute("Seller")Seller seller,ModelMap map)
	    {
		int sellerId=seller.getSellerId();
	   Seller sellerObj=service.getSellerById(sellerId);
	         seller.setToken(sellerObj.getToken());
		     seller.setAddr(sellerObj.getAddr());
		     seller.setProImage(sellerObj.getProImage());
		     seller.setLoc(sellerObj.getLoc());
		     seller.setLanguage(sellerObj.getLanguage());
		     seller.setInterest(sellerObj.getInterest());
		 service.updateSeller(seller);
		 sellerObj=service.getSellerById(sellerId);
		map.addAttribute("sellerObject",sellerObj);
		    return "sellerSetting";
	    }
	@RequestMapping("/updateAddress")
	public String showUpdateAddressOfSeller(@RequestParam("sellerId")int sellerId,
			                                @ModelAttribute("Address")Address addr,ModelMap map){
		  
		 Seller seller=service.getSellerById(sellerId);
			addr.setAddrId(seller.getAddr().getAddrId());
			System.out.println(addr);
			addrService.updateAddress(addr);
			//Data send to the UI
			 seller=service.getSellerById(sellerId);
			map.addAttribute("sellerObject",seller);  
		  return "sellerSetting";
	    }
	/**
	 * Login process
	 */
	@RequestMapping(value="/loginSeller",method=RequestMethod.POST)
	public String doLoginSeller(
			@RequestParam("username")String sellerEmail,
			@RequestParam("password")String Pwd,
			HttpServletRequest req,ModelMap map){
		
		String msg=null;
		String pageName=null;
		Seller sellerObj=service.getSellerByUmailAndPwd(sellerEmail, Pwd);
		    
		if(sellerObj==null){
			msg="Username or Password is Invalid";
			pageName="sellsHome";
			map.addAttribute("msg",msg);
			return pageName;
		   }else{
		  //create session and goto home page
			HttpSession ses=req.getSession();
			ses.setAttribute("sellerObj",sellerObj);
			pageName="SellerDashboard";
			return pageName;
			}
	  }
	
	/**
	 * Logout process
	 */
	@RequestMapping("/sellerLogout")
	public String doLogout(HttpServletRequest req,ModelMap map){
		//read current session of user
		HttpSession ses=req.getSession(false);
		ses.setAttribute("sellerObj", null);
		ses.invalidate();
		map.addAttribute("Logout Sucess", "Logout");
		return "sellsHome";
	}
}
