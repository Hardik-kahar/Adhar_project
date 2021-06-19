package com.aadhar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.aadhar.model.UserInfo;
import com.aadhar.service.Aadharservice;

@Controller
public class Maincontroller {
	
	//Home page handler 
	@GetMapping("/")   
	public String home(Model model) {
		model.addAttribute("title", "Aadhar Authenticate");
		return "home";
	}
	
	//base page handler 
	@GetMapping("/base")
	public String base(Model model) {
		model.addAttribute("title", "basepage");
		return "base";
	}
	
	@GetMapping("/home")   
	public String homepage(Model model) {
		model.addAttribute("title", "Home page");
		return "home";
	}
	
	@Autowired
	private Aadharservice aadharService;
	
//	@PostMapping(path="/authuser/demo")
//	public String authsavedemo(@ModelAttribute("userinfo") UserInfo userInfo) {
////	model.addAttribute("title", "auth demo");
//		System.out.println("data storig");
//		aadharService.saveUserData(userInfo);
//		return "redirect:/";
//	}
	

}
