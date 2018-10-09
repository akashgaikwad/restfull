package com.xor.swit.messanger.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import com.xor.swit.messanger.model.Message;
import com.xor.swit.messanger.service.MessageService;

@Path("/messages")
public class MessageResource {

	 MessageService service = new MessageService();
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{messageId}")
	public Message getMessage(@PathParam("messageId") long messageId, @Context UriInfo uriInfo) {
		
		Message message = service.getMessage(messageId);
		String url = getURI(uriInfo, message);
		message.addList(url, "self");
		return message;
	}

	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/default")
	public String getDefault() {
		System.out.println("******************");
		return "success";
	}

	private String getURI(UriInfo uriInfo, Message message) {
		return uriInfo.getAbsolutePathBuilder()
					  .path(MessageResource.class)
					  .path(String.valueOf(message.getId()))
					  .build().toString();
	}
}
