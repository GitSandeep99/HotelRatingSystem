package com.user.service.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {


		@ExceptionHandler(UserNotFoundException.class)
		public ResponseEntity<Map<String, Object>> resourceNotFoundExceptionHandler(UserNotFoundException ex) {
			Map<String, Object> response = new HashMap<>();
			response.put("message", ex.getMessage());
			response.put("success", false);
			response.put("statusCode", 404);

			return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		}

		


}
