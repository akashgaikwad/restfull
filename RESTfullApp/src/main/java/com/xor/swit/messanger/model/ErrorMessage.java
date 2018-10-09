package com.xor.swit.messanger.model;

public class ErrorMessage {

	private String errroMessage;
	private long errorCode;
	private String documentation;
	
	public ErrorMessage() {
	
	}
	public ErrorMessage(String errroMessage, long errorCode, String documentation) {
	
		this.errroMessage = errroMessage;
		this.errorCode = errorCode;
		this.documentation = documentation;
	}
	public String getErrroMessage() {
		return errroMessage;
	}
	public void setErrroMessage(String errroMessage) {
		this.errroMessage = errroMessage;
	}
	public long getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(long errorCode) {
		this.errorCode = errorCode;
	}
	public String getDocumentation() {
		return documentation;
	}
	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}
	
	
}
