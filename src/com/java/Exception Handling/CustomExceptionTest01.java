package com.java.ExceptionHandling;

class NegativeNumberException extends Exception {
	NegativeNumberException(){
		super();
	}
	NegativeNumberException(String message){
		super(message);
	}
}