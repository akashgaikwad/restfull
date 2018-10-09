package com.xor.swit.messanger.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.xor.swit.messanger.model.ErrorMessage;

@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException> {

	@Override
	public Response toResponse(DataNotFoundException exception) {

		ErrorMessage error = new ErrorMessage(exception.getMessage(),404l,"google.com");
		return Response.status(Status.NOT_FOUND)
						.entity(error)
						.build();
	}

	
}
