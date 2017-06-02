package lancer.total.controller;

import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lancer.e_insertproject.domain.E_Insert;
import lancer.total.service.E_InsertprojectService;

@Controller
@RequestMapping("/e_insertproject/*")
public class E_InsertprojectController {
	
	@Inject
	private E_InsertprojectService service;

	@RequestMapping(value = "/e_insertproject", method = RequestMethod.GET)
	public void insertprojectGET(Model model) throws Exception{
		model.addAttribute("getnum", service.getnum());
	}
	
	@RequestMapping(value = "/e_insertproject", method = RequestMethod.POST)
	public String insertprojectPOST(E_Insert project, Model model, Map<String, Integer> map) throws Exception{
		
		service.insertProject(project);
		service.insertP_Job(map);
		model.addAttribute("project", project);
		model.addAttribute("map", map);
		
		return "/e_insertproject/e_finishproject";
	}

}
