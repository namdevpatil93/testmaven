package com.sts.testmaven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommonController {

	@RequestMapping(value="/")
	//@ResponseBody
	ModelAndView test()
	{
		System.out.println("In /");
		return new ModelAndView("welcome");
	}
}
