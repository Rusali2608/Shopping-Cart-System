package com.product.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.product.exception.EmptyInputException;
import com.product.exception.ProductNotFoundException;

@ControllerAdvice //it will handle exception globally(Exception controller)
public class ProductExceptionController {
	
	@ExceptionHandler(EmptyInputException.class)
	public ResponseEntity<String> handleEmptyInput(EmptyInputException emptyInputException){
		return new  ResponseEntity<String> ("Input Field is empty, Please provide Input", HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<Object> handleproductnotexception(ProductNotFoundException exception){
		return new  ResponseEntity<> ("Product not Found , please give valid product", HttpStatus.NOT_FOUND);
	}
	
}