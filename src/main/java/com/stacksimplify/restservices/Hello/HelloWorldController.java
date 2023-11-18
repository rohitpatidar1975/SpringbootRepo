package com.stacksimplify.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController 
{
	@GetMapping(path="/hello")
	public String helloWorld()
	{
		return "Hello World";
	}
	
	@GetMapping(path="/helloworld-bean")
	public UserDetails helloWorldBean()
	{
		return new UserDetails("Rohit","Patidar","Indore");
	}
}
