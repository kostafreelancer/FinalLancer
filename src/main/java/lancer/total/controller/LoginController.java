package lancer.total.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lancer.c_login.domain.c_loginVO;
import lancer.total.service.c_loginService;


@Controller
@RequestMapping("/c_login/*")
public class LoginController {
	
	@Inject
	c_loginService service;
	
	@RequestMapping(value = "login", method= RequestMethod.GET)
	public void login(){
	
	}
	
	@RequestMapping(value="/check_login")
	public String check_login(@ModelAttribute("c_loginVO") c_loginVO vo){
		
		
		
		return null;
	}
}
