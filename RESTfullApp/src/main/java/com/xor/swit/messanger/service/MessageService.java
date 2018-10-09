package com.xor.swit.messanger.service;

import java.util.Map;

import com.xor.swit.messanger.DatabaseClass;
import com.xor.swit.messanger.exceptions.DataNotFoundException;
import com.xor.swit.messanger.model.Message;

public class MessageService {
	
	Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public MessageService() {
		messages.put(1L, new Message(1L,"message1", "author1"));
		messages.put(2L, new Message(2L,"message2", "author2"));
	}
	
	public Message getMessage(long id){
		
		Message message = messages.get(id);
		if (message == null) {
			throw new DataNotFoundException("Errrrrr!!!!!!!!!!!!!!Not Found");
		}
		
		return message;
		
	}

}
