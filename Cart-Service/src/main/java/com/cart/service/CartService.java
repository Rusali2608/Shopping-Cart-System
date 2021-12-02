package com.cart.service;

import java.util.List;
import java.util.Optional;

import com.cart.model.Cart;

public interface CartService {

	public Cart additemtocart(Cart cart);
	public List<Cart> getAll();
	public Optional<Cart> getCartItemById(String productName);
	public String deleteItembyId(String productName);
	public String updateItemDetails( Cart cart,String productName);
		
}
