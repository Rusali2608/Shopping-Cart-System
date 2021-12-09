package com.order.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import com.order.exception.OrderNotFoundException;
import com.order.model.Orders;
import com.order.repository.OrdersRepository;

public class OrderServiceImpl implements OrderService {

	@Autowired
	OrdersRepository orderRepository;
	
	@Override
	public List<Orders> getAllOrders() {
		
		List<Orders> order= orderRepository.findAll();
		if(order.isEmpty()) {
			throw new OrderNotFoundException("501","Order not Found Please Check Again");
		}else
		{
		return order;

		}
	}

	@Override
	public Orders addOrder(Orders order) {
		if(order.getProducts().isEmpty()) {
			throw new OrderNotFoundException("503"," product field cannot be empty !!");
		}
		else if(order.getAddress().isEmpty())	{
			throw new OrderNotFoundException("503"," address Field cannot be empty !!");
		}
	else{
		return orderRepository.save(order);
	}
	}

	@Override
	public String deleteOrder(int orderId) {
		boolean isOrderExist= orderRepository.existsById(orderId);
		if(isOrderExist)
		{
		orderRepository.deleteById(orderId);
		return "Product deleted"+orderId;
		}
		else {
		throw new OrderNotFoundException("567" ,"Wrong Id!! Product cannot be deleted ,Provide valid id !!");
		}
	}

	@Override
	public String updateOrder(Orders order, int orderId) {
		boolean isOrderExist = orderRepository.existsById(orderId);
		if(isOrderExist)
		{
		orderRepository.save(order);
		return "order updated" + orderId;
		}
		else
		{
			throw new OrderNotFoundException("544" ,"Wrong OrderId !!! Give valid OrderId !!");
		}
	}

	@Override
	public Optional<Orders> getOrderById(int orderId) {
		Optional<Orders> findOrderById= orderRepository.findById(orderId);
        if(findOrderById.isEmpty()) {
           throw new OrderNotFoundException("604","Order not found with this ID !! Provide vaild orderId");
        }else {
         return orderRepository.findById(orderId) ;
          }
	}

}
