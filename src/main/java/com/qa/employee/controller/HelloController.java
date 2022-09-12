package com.qa.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("api/v1/employee-service")
public class HelloController {
	
	/*
	 * @RequestMapping(value = "/employee-service/hello", method =
	 * RequestMethod.GET) public String sayHello() {
	 * System.out.println("sayHello -> get request"); return "Hello !!"; }
	 */
	@GetMapping("/employees")
	public String sayHello() {
		System.out.println("sayHello -> get request");
		return "Hello !!";
	}


}
