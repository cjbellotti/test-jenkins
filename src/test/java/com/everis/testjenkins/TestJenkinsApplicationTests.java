package com.everis.testjenkins;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.everis.testjenkins.controller.dto.MessageResponseDTO;
import com.everis.testjenkins.service.MessageService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestJenkinsApplicationTests {

	@Autowired
	private MessageService messageService;
	
	@Test
	public void contextLoads() {
		MessageResponseDTO response = this.messageService.sayHello("Pedro");
		assertTrue("Se esperaba \"Hi Pedro\" pero se obtuvo \"" + response.getMessage() + "\"", response.getMessage().equals("Hi Pedro"));
	}

}
