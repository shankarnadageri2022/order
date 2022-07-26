package com.cg.order.controller;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.cg.order.model.Order;
import com.cg.order.repository.OrderRepository;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class OrderControllerTest {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public void givenOrderShoulReturnOrderObject() {
		Order o1=new Order();
		
	}

}
