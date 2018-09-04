package com.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/panu")
public class HelloWorldController 
{
	Student student = new Student();
	
	/*@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloworld";
	}
	
	@RequestMapping("/processFormv2")
	public String processFormv2(@RequestParam("studentName") String name, Model model)
	{
		name = name.toUpperCase();
		
		String result = "Hey " + name;
		
		model.addAttribute("message", result);
		return "Hey";
	}*/
	
	@RequestMapping("/showForm")
	public String showForm(Model model)
	{
		
		
		model.addAttribute("student",student);
		
		return "Login";
	}
	
	@RequestMapping("/processFormv3")
	public String processFormv3(@ModelAttribute("student")Student student) throws Exception
	{
		return "student-confirmation";
	}
}
