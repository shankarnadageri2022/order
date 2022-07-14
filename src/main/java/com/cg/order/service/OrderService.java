package com.cg.order.service;

import com.cg.order.model.Order;

public interface OrderService {
	public Order saveOrder(Order order);
	public Order updateOrder(Order order);
	public Order getById(int id);
	public void deleteOrder(int orderId);
}
