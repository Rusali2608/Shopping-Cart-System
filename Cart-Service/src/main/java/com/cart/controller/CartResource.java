package com.cart.controller;

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

import com.cart.model.Cart;
import com.cart.model.Items;
import com.cart.service.CartService;
import com.cart.service.CartServiceImpl;

@RestController
@RequestMapping("/cart")
public class CartResource {

	@Autowired
	CartService cartService;
	
	@PostMapping("/additemtocart")
	public Cart additemtocart(@RequestBody Cart cart) {
		return cartService.additemtocart(cart);
	}
	
	@GetMapping("/getallitem")
	public List<Cart> getAll(){
		return cartService.getAll();
	}
	
	@GetMapping("/getallitem/{productName}")
	public Optional<Cart> getCartItemById(@PathVariable String productName){
		return cartService.getCartItemById(productName);
	}
	
	@DeleteMapping("/deleteitembyid/{cartId}")
	public String deleteItembyId(@PathVariable String productName) {
		return cartService.deleteItembyId(productName);
	}
	
	@PutMapping("/updateitembyid/{cartId}")
	public String updateItemDetails(@RequestBody Cart cart,@PathVariable String productName) {
		cartService.getCartItemById(productName);
		cartService.additemtocart(cart);
		return "updated item with id" + productName;
	}
}
