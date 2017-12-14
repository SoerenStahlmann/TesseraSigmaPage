package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController{
	

	/**
	 * the @RequestMapping shows the path under which we return the index.html.
	 * just returning the String is thymeleaf standard which gets the html under
	 * resurces/template with this name.
	 * 
	 * @return the index.html
	 */
	@RequestMapping("/services")
	public String index() {
		System.out.println("received request for - index");
		return "index";
	}
	
	@RequestMapping("/")
	public String landing() {
		System.out.println("received request for - landing");
		return "landing";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("received request for - about");
		return "about";
	}
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("received request for - home");
		return "home";
	}
	
	
}
