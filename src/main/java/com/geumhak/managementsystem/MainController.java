package com.geumhak.managementsystem;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {
	
	@RequestMapping("/")
	public String hello() {
		return "SpringBoot Hello World!";
	}
	
	@RequestMapping("/index")
	public String showIndexPage() {
		String viewName = "index";
		return viewName;
	}
	
	// index.do
	@RequestMapping(value = {"/index.do"}, method = RequestMethod.GET)
	public ModelAndView viewIndexPage (HttpServletRequest request, HttpServletResponse response) throws Exception {
    	String viewName = (String) request.getAttribute("viewName");
		ModelAndView mav = new ModelAndView();
		mav.setViewName(viewName);
		return mav;
	}
	
	// add-cattle.do
	@RequestMapping(value = {"cattle/add-cattle.do"}, method = RequestMethod.GET)
	public ModelAndView addCattle (HttpServletRequest request, HttpServletResponse response) throws Exception {
    	String viewName = (String) request.getAttribute("viewName");
		ModelAndView mav = new ModelAndView();
		mav.setViewName(viewName);
		return mav;
	}
}