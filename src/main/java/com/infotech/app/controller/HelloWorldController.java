package com.infotech.app.controller;

import org.springframework.web.bind.annotation.*;
@RestController
public class HelloWorldController {
   
	@RequestMapping(value="/")
	public String hello() {
		return "Hello World";
	}
}
