package com.everis.testjenkins.service;

import com.everis.testjenkins.controller.dto.MessageResponseDTO;

public interface MessageService {

	public MessageResponseDTO sayHello(String name);
	
}
