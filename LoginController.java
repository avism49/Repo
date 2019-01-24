package com.springmvcs.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 


@ Controller
@RequestMapping("/login.abc")
public class LoginController   {

	//@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) 
			throws Exception {
		
		System.out.println("!!!!!!!!"+ req.getParameter("userName"));
	
		ModelAndView mv = new ModelAndView("Home");
		mv.addObject("name", req.getParameter("userName"));
		return mv;  

	
	}
		
	}


