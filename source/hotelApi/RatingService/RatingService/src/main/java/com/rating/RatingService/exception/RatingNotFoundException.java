package com.rating.RatingService.exception;

public class RatingNotFoundException extends RuntimeException {
	

	public RatingNotFoundException(String message) {
		super("Rating not Found with id:");
	}

	
}
