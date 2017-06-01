package lancer.total.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lancer.f_main.domain.member;
import lancer.total.service.f_mainService;

@Controller
@RequestMapping("/f_main/*")
public class f_mainController {

	@Inject
	f_mainService service;
	
	@RequestMapping(value="/f_main", method = RequestMethod.GET)
	public void f_mainGET(Model model, List<member> m) throws Exception{
		
		model.addAttribute("m", m);
	}
	
	@RequestMapping(value="/f_main", method = RequestMethod.POST)
	public void f_mainPOST(Model model, List<member> m) throws Exception{
		
		
		model.addAttribute("m", m);
	}
}
