package com.product;


import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.web.context.WebApplicationContext;

import com.product.controller.ProductResource;
import com.product.repository.ProductRepository;



@WebMvcTest(ProductResource.class)
public class ProductControllerTest {
	
	@MockBean
	private ProductRepository productRepository;
	
	//@Autowired
	//private WebApplicationContext webApplicationContext;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	void shouldCreateMockMvc() {
		assertNull(mockMvc);
	}
}
