package com.myboottest.application.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
// @RestController = @Controller + @ResponseBody
public class HomeController {
	@RequestMapping(value = "/myboottest", method = RequestMethod.GET)
	public ModelAndView home(ModelAndView mv, HttpServletRequest request, HttpServletResponse response) {
		System.out.println("normal home page");
		
		mv.setViewName("home");
		
		return mv;
		
	}

}