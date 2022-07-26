package com.cg.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.order.model.Order;
import com.cg.order.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	
	@PostMapping("/save")
	public Order addOrder(@RequestBody Order order) {


		return orderService.saveOrder(order);
	}
	
	@PutMapping("/update")
	public Order updatedOrderProfile(@RequestBody Order order) {
		
		return orderService.updateOrder(order);
	}
	
	@GetMapping("/find/{orderId}")
	public Order fetchOrderById(@PathVariable("orderId") int orderId) {
		
		return orderService.getById(orderId);
	}
	
	@DeleteMapping("/delete/{orderId}")
	public ResponseEntity<String> removeOrder(@PathVariable("orderId") int orderId) {
		
		orderService.deleteOrder(orderId);		
		ResponseEntity<String> responseEntity = new ResponseEntity<>("Product Deleted Successfully.", HttpStatus.OK);
		return responseEntity;		
	}
}
