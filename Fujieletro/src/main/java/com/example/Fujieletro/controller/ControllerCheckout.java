package com.example.Fujieletro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ControllerCheckout {
	
	@PostMapping ("/checkout")
	public ModelAndView login () {
		ModelAndView mv = new ModelAndView ("checkout");
		return mv;
	}

}
