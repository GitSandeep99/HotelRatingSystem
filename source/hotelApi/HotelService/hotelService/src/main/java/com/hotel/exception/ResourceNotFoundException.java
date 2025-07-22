package com.hotel.exception;


public class ResourceNotFoundException  extends RuntimeException{
	
	public ResourceNotFoundException(String message){
		super("Resource not Found with this id");
	}
	
	

}
