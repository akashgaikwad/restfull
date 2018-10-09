package com.xor.swit.messanger.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Message {
	
	private long id;
	private String message;
	private String author;
	private Date created;
	Map<Long, Comment> commnets = new HashMap<>();
	List<Link> list = new ArrayList<>();
	
	
	   public Message() {
	    	
	    }
	    
	     
	    
	    public Message(long id, String message, String author) {
			
			this.id = id;
			this.message = message;
			this.author = author;
		}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	
	@XmlTransient
	public Map<Long, Comment> getCommnets() {
		return commnets;
	}
	public void setCommnets(Map<Long, Comment> commnets) {
		this.commnets = commnets;
	}
	
	
	public void addList(String url, String rel) {
		
		Link link = new Link();
		link.setLink(url);
		link.setRel(rel);
		
		list.add(link);
		
	}
	
	
}
