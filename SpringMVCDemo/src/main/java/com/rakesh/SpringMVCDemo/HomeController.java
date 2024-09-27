package com.rakesh.SpringMVCDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("num1") int a, @RequestParam("num2") int b, ModelAndView mv)
	{
		int result = a+b;
		mv.addObject("result",result);
		mv.setViewName("result");
		return mv;
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(@ModelAttribute Alien alien)
	{
		return "result";
	}
	
	@ModelAttribute("course")
	public String courseName()
	{
		return "Spring";
	}
	
}
