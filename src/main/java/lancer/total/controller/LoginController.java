package lancer.total.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/c_login/*")
public class LoginController {
	
	@RequestMapping(value = "login", method= RequestMethod.GET)
	public void login(){
	
	}
	
}
