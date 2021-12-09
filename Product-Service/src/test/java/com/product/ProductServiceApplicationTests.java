package com.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import com.product.model.Product;
import com.product.repository.ProductRepository;

/*
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;



import org.springframework.test.context.junit4.SpringRunner;

import com.product.exception.EmptyInputException;
import com.product.model.Product;
import com.product.repository.ProductRepository;
import com.product.service.ProductService;

*/

//@RunWith(SpringRunner.class)
@SpringBootTest
	class ProductServiceApplicationTests {

		/* 
	     
		@Autowired
		private ProductService productService;
		
		@MockBean
		private ProductRepository productRepository;
		
		@Test
		public void getAllProductTest()
		{
			when(productRepository.findAll()).thenReturn(Stream.of
					(new Product(2,"Mobile","Realme","abcd","pic.jpg",5000.0,4,"medium"),new Product(6,"Laptop","HP","abcd","pic.jpg",5000.0,4,"medium"))
					.collect(Collectors.toList()));
			assertEquals(2,productService.getAllProducts().size());
		}
		@Test
		public void addProduct() throws EmptyInputException
		{
			Product product = new Product(2,"Mobile","Realme","abcd","pic.jpg",5000.0,4,"medium");
			when(productRepository.save(product)).thenReturn(product);
			assertEquals(product,productService.addProduct(product));
		}
		@Test
		public void deleteByProductId() throws EmptyInputException
		{
			Product product = new Product(5,"Clock","Titan","abcd","cat.jpg",4000.0,5,"good");
			productService.deleteByProductId(product,5);
			verify(productRepository,times(1)).delete(product);
		}
		@Test      
		public void updateProduct() throws EmptyInputException
		{
			Product product = new Product(4,"Toy","Ship","Toys","doc.jpd",2000.0,0,"good");
			productService.updateProduct(product, 4);
			verify(productRepository,times(1)).save(product);
		}
		
		@Test
		public void deleteByProductIdTest() throws EmptyInputException
		{
			String test = productService.deleteByProductId(null, 4);
			assertEquals("Id deleted ",test);
			Product product = new Product(4,"Toy","Ship","Toys","doc.jpd",2000.0,0,"good");
			productRepository.save(product);
		}
		
		
	*/	
		
	@Autowired
	ProductRepository productRepository;
	
	@Test
	public void testCreate() {
		Product p=new Product();
		p.setProductId(56);
		p.setProductType("gadgets");
		p.setProductName("iphone");
		p.setCategory("Electronics");
		p.setImage("img.jpg");
		p.setPrice(500.00);
		p.setDescription("good");
		p.setRating(5);
		productRepository.save(p);
		assertNotNull(productRepository.findById(6).get());
	}

	@Test
	public void testReadAll() {
		List<Product> list = productRepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
	
	/*@Test
	public void testSingleProduct() {
		Product product=productRepository.findById(6).get();
		assertEquals(2000.00, product.getPrice());
	}*/
	
	@Test
	public void testupdate() {
		Product p = productRepository.findById(3).get();
				p.setPrice(600.00);
				productRepository.save(p);
				assertNotEquals(700.00,productRepository.findById(3).get().getPrice());
		        
	}
	
	@Test
	public void testDelete() {
		productRepository.deleteById(1);
		assertThat(productRepository.existsById(1)).isFalse();
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * @Test public void getProductByIdTest() { int productId = 2;
		 * when(proRepository.findById(productId)).thenReturn(Optional.of(Stream.of (new
		 * Product(2,"Mobile","Realme","abcd","pic.jpg",5000,4,"medium"),new
		 * Product(6,"Laptop","HP","abcd","pic.jpg",5000,4,"medium"))
		 * .collect(Collectors.toList()))); }
		 */
		
		
		
		
		
		/*
		 * @Test public void addProductTest() { Product pd =new Product();
		 * pd.setProductId(2); pd.setProductType("Mobile"); pd.setProductName("Realme");
		 * pd.setCategory("abcd"); pd.setImage("pic.jpg"); pd.setPrice(null);
		 * pd.setRating(4); pd.setDescription("Medium"); proRepository.save(pd);
		 * assertNotNull(proRepository.findById(2).get()); }
		 */
		 
		
		
		
		
		
		
		
					/*
					 * @Test public void getProductBynameTest() { String productName ="Realme";
					 * when(proRepository.findByProductName(productName)).thenReturn(Stream.of( new
					 * Product(2,"Mobile","Realme","abcd","pic.jpg",5000,4,"medium")).
					 * collect(Collectors.toList())); }
					 /	/
		 * public void getProductByCategoryTest() { String category ="abcd";
		 * when(proRepository.findByProductName(category)).thenReturn(Stream.of( new
		 * Product(2,"Mobile","Realme","abcd","pic.jpg",5000,4,"medium")).
		 * collect(Collectors.toList())); }
		 * 
		 * public void getProductByTypeTest() { String type="Mobile";
		 * when(proRepository.findByProductName(type)).thenReturn(Stream.of( new
		 * Product(2,"Mobile","Realme","abcd","pic.jpg",5000,4,"medium")).
		 * collect(Collectors.toList())); }
		 */	
		
					/*
					 * @Test public void deleteByProductIdTest() { Product product=new
					 * Product(2,"Mobile","Realme","abcd","pic.jpg",5000,4,"medium");
					 * proService.deleteByProductId(product,2);
					 * verify(proRepository,times(1)).delete(product); }
					 * 
					 * @Test public void updateByProductIdTest() { Product product = new
					 * Product(2,"Mobile","Realme","abcd","pic.jpg",5000,4,"medium");
					 * proService.updateProduct(product, 2); verify(proRepository,times(1)); }
					 */
		
		 
		}
