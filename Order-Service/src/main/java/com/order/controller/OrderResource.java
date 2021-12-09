package com.order.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.model.Orders;
import com.order.service.OrderService;


@RestController
@RequestMapping("/api/order")
public class OrderResource {

	@Autowired
	OrderService orderservice;
	
	//for getting all the orders
	@GetMapping("/getAllOrder")
	List<Orders> getAllOrders(){
		return orderservice.getAllOrders();
	}
	
	//for adding order details
	@PostMapping("/addOrder")
	Orders addOrder(@RequestBody Orders order) {
		return orderservice.addOrder(order);
	}
	
	
	 //for deleting order details
	@DeleteMapping("/deleteById/{orderId}")
	String deleteOrder(@PathVariable int orderId ) {
		return orderservice.deleteOrder(orderId);
	}
	
	
	//for updating order detail by using order id
	@PutMapping("/updateOrderById/{orderId}")
	String updateOrder(@RequestBody Orders order ,@PathVariable int orderId) {
		return orderservice.updateOrder(order, orderId);
	}
	
	
	//for getting order details using order id
	@GetMapping("/getById/{orderId}")
	Optional<Orders> getOrderById(@PathVariable int orderId){
		return orderservice.getOrderById(orderId);
	}
}
