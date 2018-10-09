package com.xor.swit.messanger.exceptions;

public class DataNotFoundException extends RuntimeException {

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	final String message;
	
	public DataNotFoundException(String message) {
		
		this.message = message;  
	}
}
