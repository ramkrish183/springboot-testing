package com.rameshj.springbootapps.service;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mockito;

import com.rameshj.springbootapps.repository.Customer;
import com.rameshj.springbootapps.repository.CustomerRepository;

public class CustomerServiceImplTest {
	
	private CustomerRepository customerRepo;
	private CustomerServiceImpl customerService;
	
	@BeforeEach
	void setUp() {
		customerRepo=Mockito.mock(CustomerRepository.class);
		customerService=new CustomerServiceImpl(customerRepo);
	}

	
	@Test
	public void testWhenServiceReturnsAllData() {
		Customer c1=new Customer(1,"Name1","600 Chatham");
		Customer c2=new Customer(1,"Name2","600 Chatham");
		
		BDDMockito.given(customerRepo.findAll()).willReturn(Arrays.asList(c1,c2));
		List<Customer> list=customerService.getAllCustomers();
		
		assertThat(list).hasSize(2);
		assertNotNull(list);
	}
}
