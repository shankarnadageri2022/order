package com.cg.order.exception;

public class OrderNotFoundException extends RuntimeException {
	
	public OrderNotFoundException(String msg) {
		super(msg);
	}

}
