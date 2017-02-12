package com.deloitte.devops.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ShopController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String viewShop(Model model) {

		return "Shop1";
	}
	
	@RequestMapping(value = "item", method = RequestMethod.GET)
	public String viewItem(Model model) {

		return "Item";
	}
}
