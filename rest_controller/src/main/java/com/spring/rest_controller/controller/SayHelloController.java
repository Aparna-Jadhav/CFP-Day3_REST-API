package com.spring.rest_controller.controller;

import com.spring.rest_controller.model.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * This class use RestController for handle REST API call with RequestMapping for mapping URL
 */
@RestController
@RequestMapping("/hello")
public class SayHelloController 
{
	/**
	 * This method use RequestMapping for mapping URL and return string
	 */
    @RequestMapping(value= {"", "/", "/home"})
	public String sayHello()
	{
		return "Hello World";	
	}

	/**
	 * This method use RequestMapping for mapping URL with RequestParam for accessing HTTP
	 * request query parameters and return string with name
	 */
	@RequestMapping(value = {"/query"}, method = RequestMethod.GET)
	public String sayHello(@RequestParam(value = "name") String name)
	{
		return "Hello " +name ;
	}

	/**
	 * @param name accessing from HTTP request mapping with URL
	 * @return string with name
	 */
	@GetMapping("/param/{name}")
	public String sayHelloParam(@PathVariable String name)
	{
		return "Hello " +name;
	}

	/**
	 * @param user accessing name from user model with HTTP mapping with URL
	 * @return string first name and last name 
	 */
	@PostMapping("/post")
	public String sayHello(@RequestBody User user)
	{
		return "Hello " +user.getFirstName()+ " " +user.getLastName();
	}

	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @return
	 */
	@org.springframework.web.bind.annotation.PutMapping("/put/{firstName}")
	public String sayHello(@PathVariable String firstName,
							@RequestParam(value = "lastName")  String lastName)
	{
		return "Hello " +firstName+ " " +lastName;
		
	}

	
}
