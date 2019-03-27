package com.everis.testjenkins.service;

import org.springframework.stereotype.Service;

import com.everis.testjenkins.controller.dto.MessageResponseDTO;

@Service
public class MessageServiceImpl implements MessageService {

	@Override
	public MessageResponseDTO sayHello(String name) {
		MessageResponseDTO response = new MessageResponseDTO();
		response.setMessage("Hi " + name);
		return response;
	}

}
