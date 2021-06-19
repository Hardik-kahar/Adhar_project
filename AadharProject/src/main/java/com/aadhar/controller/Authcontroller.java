package com.aadhar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.aadhar.model.UserInfo;
import com.aadhar.repository.AadharRepository;
import com.aadhar.service.Aadharservice;

@Controller
//@RequestMapping("/authuser")
public class Authcontroller {

	@Autowired
	private Aadharservice aadharService;
	
	@PostMapping(path="/authuser/demo")
	public String authsavedemo(@ModelAttribute("userinfo") UserInfo userInfo) {
//		model.addAttribute("title", "auth demo");
		System.out.println("data storig");
		aadharService.saveUserData(userInfo);
		return "redirect:/";
	}
	
	@GetMapping(path="/authuser/demo")
	public String authsavedemo1(@ModelAttribute("userinfo") UserInfo userInfo) {
//		model.addAttribute("title", "auth demo");
		System.out.println("data storig");
		aadharService.saveUserData(userInfo);
		return "redirect:/base";
	}
	
	@GetMapping(path="/authuser/demo/form")
	public ModelAndView authsavedemo2() {
		System.out.println("data storig");
		ModelAndView mv = new ModelAndView("demo");
		return mv;
	}
	
	@GetMapping("authuser")
	public String testing() {
		return"auth/test";
	}
	
}
