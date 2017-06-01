package lancer.total.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/e_insertproject/*")
public class e_insertprojectController {

		@RequestMapping(value = "e_insertproject", method= RequestMethod.GET)
		public void insertproject(){
			
		}
	}
