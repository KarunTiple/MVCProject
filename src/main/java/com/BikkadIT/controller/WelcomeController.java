package com.BikkadIT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	public WelcomeController() {
		super();
		System.out.println("WelcomeController class Constructor");
	}

	@GetMapping("/welcomeMsg")
	public ModelAndView welcomeMsg() {
		String msg = "Java is a Programming Language.";

		ModelAndView mav = new ModelAndView();
		mav.addObject("MESSAGE", msg);
		mav.setViewName("welcome");

		return mav;
	}

}
