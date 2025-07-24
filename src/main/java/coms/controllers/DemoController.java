package coms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/home")
	public String Page1()
	{
		return "Home";  // Home is Home.jsp file name
	}
	
	@GetMapping("/contact")
	public String Page2()
	{
		return "Contact";  // Home is Home.jsp file name
	}
	
	@GetMapping("/about")
	public String Page3()
	{
		return "About";  // Home is Home.jsp file name
	}
}
