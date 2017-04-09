package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PriyakartController {
	
	@RequestMapping("/itemCart")
	public String showAddItemPage()
	{
		return "Cart";
	}	 
}
