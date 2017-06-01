package lancer.total.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lancer.total.service.F_MypageService;

@Controller
@RequestMapping("/f_mypage")
public class F_MypageController {
	
	@Inject
	private F_MypageService service;
	
	@RequestMapping(value="/myInfo")
	public void showFreelancerInfo(HttpSession session, Model model){
		//service.showFreelancerInfo(session.getAttribute("id"))
	}
	
}
