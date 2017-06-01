package lancer.total.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lancer.total.service.C_JoinService;

@Controller
@RequestMapping("/c_join/*")
public class C_JoinController {

	C_JoinService service;

}
