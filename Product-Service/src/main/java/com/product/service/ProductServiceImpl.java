package com.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import com.product.exception.EmptyInputException;
import com.product.exception.ProductNotFoundException;
import com.product.model.Product;
import com.product.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {
	

	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {
		List<Product> product= productRepository.findAll();
		if(product.isEmpty()) {
			throw new EmptyInputException("333","Input Field is empty, Please provide Input");
		}else
		{
			return product;
			
		}
	}

	@Override
	public Optional<Product> getProductById(int productId) {
		Optional<Product> findByid =productRepository.findById(productId);
		if(findByid.isEmpty()){
			throw new ProductNotFoundException("333","Product not Found , please give valid product");
		}else
		{
			return productRepository.findById(productId);
			
		}
	}

	@Override
	public Product addProduct(Product product) {
		if(product.getProductName().isBlank() || product.getProductName().length()==0) {
			throw new EmptyInputException("678","value can not be null");
		}
		else
			return productRepository.save(product);
	}

	@Override
	public String updateProduct(Product product, int productId) {
		boolean isProductExist= productRepository.existsById(productId);
		if(isProductExist) {
		    productRepository.save(product);
		    return "Product updated"+productId;
		}
		else {
			throw new ProductNotFoundException("567" ,"Product not Found , please give valid product ");
		}
	}

	@Override
	public String deleteByProductId(Product product, int productId) {
		boolean isProductExist= productRepository.existsById(productId);
		if(isProductExist) {
		    productRepository.deleteById(productId);
		    return "Product deleted"+productId;
		}
		else {
			throw new ProductNotFoundException("789" ,"Product not Found , please give valid product");
		}
	}

	

}
