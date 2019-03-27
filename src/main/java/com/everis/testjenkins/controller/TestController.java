package com.everis.testjenkins.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.everis.testjenkins.controller.dto.MessageResponseDTO;
import com.everis.testjenkins.service.MessageService;

@RestController
@RequestMapping("/test")
public class TestController {

	@Autowired
	private MessageService messageService;
	
	@GetMapping("/say-hello")
	public MessageResponseDTO sayHello(@RequestParam(name = "name", required = true) String name) {
		return this.messageService.sayHello(name);
	}
}
