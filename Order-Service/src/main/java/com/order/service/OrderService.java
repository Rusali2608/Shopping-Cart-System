package com.order.service;

import java.util.List;
import java.util.Optional;

import com.order.model.Orders;

public interface OrderService {

	List<Orders> getAllOrders();
	Orders addOrder(Orders order);
	String deleteOrder(int orderId );
	String updateOrder( Orders order , int orderId);
	
	Optional<Orders> getOrderById(int orderId);
}
