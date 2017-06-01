package lancer.total.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lancer.f_mypage.domain.Freelancer;
import lancer.total.service.F_MypageService;

@Controller
@RequestMapping("/f_mypage")
public class F_MypageController {
	
	@Inject
	private F_MypageService service;
	
	@RequestMapping(value="/myInfo")
	public void showFreelancerInfo(HttpSession session, Model model) throws Exception{
		//Freelancer freelancer = service.showFreelancerInfo((Integer)session.getAttribute("id"));
		Freelancer freelancer = service.showFreelancerInfo(3);
		String[] ph = freelancer.getF_phone().split("-");
		for(int i=0;i<ph.length; i++){
			model.addAttribute("ph"+(i+1), ph[i]);
		}
		String[] hph = freelancer.getF_hphone().split("-");
		for(int i=0;i<hph.length; i++){
			model.addAttribute("hph"+(i+1), hph[i]);
		}
		String[] email = freelancer.getF_email().split("@");
		for(int i=0; i<email.length; i++){
			model.addAttribute("email" + (i+1), email[i]);
		}
		String[] address = freelancer.getF_address().split("&");
		for(int i=0; i<address.length; i++){
			model.addAttribute("address" + (i+1), address[i]);
		}
		model.addAttribute("freelancer", freelancer);
	}
	
	
}
