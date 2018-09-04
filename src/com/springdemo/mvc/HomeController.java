package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 
{
	@RequestMapping("/")
	public String showPage()
	{
		return "main-menu";
	}
	
	@RequestMapping("/version")
	public String version()
	{
		return "version";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		return "about";
	}
}
