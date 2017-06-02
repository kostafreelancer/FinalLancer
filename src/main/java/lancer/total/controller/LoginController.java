package lancer.total.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.catalina.util.RequestUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.support.RequestPartServletServerHttpRequest;

import jdk.nashorn.internal.ir.RuntimeNode.Request;
import lancer.c_login.domain.c_loginVO;
import lancer.c_login.domain.c_login_freelancerVO;
import lancer.f_mypage.domain.Freelancer;
import lancer.total.service.c_loginService;


@Controller
@RequestMapping("/c_login/*")
public class LoginController {
	
	@Inject
	c_loginService service;
	
	@RequestMapping(value = "login", method= RequestMethod.GET)
	public void login(){
	
	}
	@RequestMapping(value="/insert.c_login")
	public String check_login(c_loginVO vo,@ModelAttribute("checking") String checked,Model model,HttpSession session){
		if(checked.equals("freelancer")){
			session.setAttribute("client",service.select_f_login(vo));
		}else{
			session.setAttribute("client",service.select_e_login(vo));
			return "redirect:/e_main/e_main";
		}
		
		return "redirect:/f_main/f_main";
	}
}
