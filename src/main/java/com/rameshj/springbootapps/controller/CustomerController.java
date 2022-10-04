package com.rameshj.springbootapps.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rameshj.springbootapps.repository.Customer;
import com.rameshj.springbootapps.service.CustomerService;

@RestController
public class CustomerController {

	CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

	@GetMapping(path = "/getCustomers")
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}
	
	@GetMapping(path = "/getAllCustomersByState")
	public List<Customer> getAllCustomersByState() {
		return customerService.getAllCustomersByState();
	}

	@GetMapping(path = "findById/{id}")
	public Customer findById(@PathVariable Integer id) {
		return customerService.findCustomer(id);
	}

	@RequestMapping(value="/addCustomer", method=RequestMethod.POST)    
	public void addCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
	}

}
