package com.rameshj.springbootapps.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.rameshj.springbootapps.service.CustomerService;

@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class CustomerControllerIntegrationTest {

	
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private CustomerService customerService;
	
	
	@Test
	void shouldReturnAllCustomers() throws Exception {
//		Customer c1=new Customer(1,"Name1","600 Chatham");
//		Customer c2=new Customer(1,"Name2","600 Chatham");
//		BDDMockito.given(customerService.getAllCustomers()).willReturn(Arrays.asList(c1,c2));
		mockMvc.perform(MockMvcRequestBuilders.get("/getCustomers")).andExpect(status().isOk());
		
	}

}
