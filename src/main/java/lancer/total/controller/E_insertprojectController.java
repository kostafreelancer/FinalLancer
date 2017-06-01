package lancer.total.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lancer.total.service.E_InsertprojectService;

@Controller
@RequestMapping("/e_insertproject/*")
public class E_insertprojectController {
	
	@Inject
	private E_InsertprojectService service;

		@RequestMapping(value = "e_insertproject", method= RequestMethod.GET)
		public void insertproject(){
			
		}
	}
