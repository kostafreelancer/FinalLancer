package lancer.total.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lancer.total.service.e_MainService;

@Controller
@RequestMapping("/e_main/*")
public class e_mainController {

	@Inject
	private e_MainService e_mainService;
	
	@RequestMapping(value="/e_main", method = RequestMethod.GET)
	public void countGET(Model model) throws Exception{
		
		model.addAttribute("freelancerNum", e_mainService.countFreelancer());
		model.addAttribute("projectNum", e_mainService.countProject());
	}

}
