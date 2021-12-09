package com.order.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.order.exception.OrderNotFoundException;

@ControllerAdvice
public class OrderExceptionController {

	@ExceptionHandler(OrderNotFoundException.class)
	public ResponseEntity<String> handleEmptyInput(OrderNotFoundException ordernotfoundException){
		return new ResponseEntity<String>(ordernotfoundException.getErrorMessage(), null, HttpStatus.BAD_REQUEST);
	}
	
}
