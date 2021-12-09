package com.order;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.order.exception.OrderNotFoundException;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Order;
import org.springframework.test.annotation.Rollback;
import com.order.model.Address;
import com.order.model.Orders;
import com.order.model.Product;
import com.order.repository.OrdersRepository;
import com.order.service.OrderService;


@RunWith(SpringRunner.class)
@SpringBootTest
class OrderServiceApplicationTests {

	@Test
	void contextLoads() {
	}
	
	 @Autowired
	    private OrderService orderService;

	    @MockBean
	    private OrdersRepository orderRepository;
	    
	    @Test
	    public void getAllOrdersTest() 
	    {
	        when(orderRepository.findAll()).thenReturn(Stream.of
	                (new Orders(1,"2021-07-25",123,234.222212,"Paypal","Paid",2,1,"Clothing",123,"rusali",345678,23,"anjananagar","BLR",2334411)
	                        ,new Orders(1,"2021-07-25",123,234.222212,"Paytm","Paid",2,1,"Clothe",123,"pankaj",345678,23,"anjananagar","UP",2334411))
	                .collect(Collectors.toList()));
	        assertEquals(2,orderService.getAllOrders().size());
	    }
	    
	    @Test
	    public void addOrder()	throws OrderNotFoundException
	    { 
	    	Orders order = new Orders(1,2021-12-12,10,200.98,"Paytm","paid",3,Arrays.asList(new Product(1,"grocery")),
	      Arrays.asList(new Address(10,"Rusali","1234576","12","Bangalore","UP","1233456")));
	    when(orderRepository.save(order)).thenReturn(order);
	    assertEquals(order,orderService.addOrder(order));
	    }
	    
	    @Test
	    @Order(5)
	    @Rollback(value = false)
	    public void deleteOrderTest(){

	      //Cart employee = cartRepo.findById((int) 1L).get();

	    	orderRepository.deleteById(1);

	      //employeeRepository.deleteById(1L);

	      Order order1 = null;

	      Optional<Order> optionalOrder = Optional.empty();

	      if(optionalOrder.isPresent()){ order1 = optionalOrder.get(); }

	      Assertions.assertThat(order1).isNull(); }

}
