package com.cg.order.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.order.exception.OrderNotFoundException;
import com.cg.order.model.Order;
import com.cg.order.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Order saveOrder(Order order) {

		Order newOrder = orderRepository.save(order);
		return newOrder;
	}

	@Override
	public Order updateOrder(Order order) {
		Optional<Order> newOrder = orderRepository.findById(order.getOrderId());
		Order order1 = orderRepository.save(order);

		return order1;
	}

	@Override
	public Order getById(int id) throws OrderNotFoundException {
		// TODO Auto-generated method stub
		Optional<Order> orderById = orderRepository.findById(id);

		if (orderById.isEmpty()) {
			throw new OrderNotFoundException(" order not found with id : " + id);
		}
		Order order = orderById.get();
		return order;

	}

	@Override
	public void deleteOrder(int ordertId) {
	
		Optional<Order> optionalProduct = orderRepository.findById(ordertId);
		if(optionalProduct.isEmpty()) {
			throw new OrderNotFoundException("Product Not found with id: "+ordertId);
		}
		
		orderRepository.deleteById(ordertId);		
	}

}
