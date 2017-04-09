package com.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Consumer;
import com.app.service.IConsumerService;

@Controller
public class ConsumerController {
	
	@Autowired
	private IConsumerService service;
	
	@RequestMapping("/regCons")
	public String showConsumerReg(ModelMap map){
		return "ConsumerReg";
	}
	
	@RequestMapping("/loginCons")
	public String showConsumerLogin(){
		return "ConsumerLogin";
	}
	
	//========Consumer Profile========
		@RequestMapping("/consProf")
		public String showConsumerProfile()
		  {
		    return "consumerProfile";
		  }
		@RequestMapping("/consSett")
		public String showConsumerSetting()
		  {
		    return "consumerSetting";
		  }
		@RequestMapping("/consChangePwd")
		public String showConsumerChangePassword()
		  {
		    return "consumerChangePassword";
		  }
	/**
	 * Send data to the Rest Client
	 * 1.read seller from Container using ModelAttribute
	 */
	@RequestMapping(value="/insertCons",method=RequestMethod.POST)
	public String saveConsumerData(@ModelAttribute("Consumer")Consumer cons,ModelMap map)
	   {
	String msg=service.saveConsumer(cons);
	   map.addAttribute("msg", msg);
		return "ConsumerReg";
      }	
	
	/**
	 * Login process
	 */
	@RequestMapping(value="/loginCons",method=RequestMethod.POST)
	public String doLoginCons(
			@RequestParam("username")String consEmail,
			@RequestParam("password")String Pwd,
			HttpServletRequest req,ModelMap map){
		
		String msg=null;
		String pageName=null;
		if(consEmail!=null && Pwd!=null)
		{
		Consumer consObj=service.getConsumerByUmailAndPwd(consEmail, Pwd);   
		if(consObj==null){
			msg="Username or Password is Invalid";
			pageName="ConsumerLogin";
			map.addAttribute("msg",msg);
			return pageName;
		   }else{
		  //create session and goto home page
			HttpSession ses=req.getSession();
			ses.setAttribute("consObj",consObj);
			pageName="ItemHome";
			return pageName;
			}
	    }
		return "CustomerLogin";
	}

	/**
	 * Logout process
	 */
	@RequestMapping("/consLogout")
	public String doLogout(HttpServletRequest req,ModelMap map){
		//read current session of user
		HttpSession ses=req.getSession(false);
		ses.setAttribute("consName", null);
		ses.invalidate();
		map.addAttribute("msg", "Logout success...");
		return "ItemHome";
	}
}
