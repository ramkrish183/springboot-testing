package com.rameshj.springbootapps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rameshj.springbootapps.repository.Customer;
import com.rameshj.springbootapps.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	public final CustomerRepository customerRepo;
	
	public CustomerServiceImpl(CustomerRepository customerRepo) {
		this.customerRepo = customerRepo;
	}

	public List<Customer> getAllCustomers() {
		return customerRepo.findAll();
	}
	
	public List<Customer> getAllCustomersByState(){
//		Stream<Customer> customerStream= customerRepo.findAll().stream().filter(p-> p.getStateCode().equals("PA"));
//		return customerStream.collect(Collectors.toList());
		return customerRepo.getAllCustomersByState();
	}

	public Customer findCustomer(int Id) {
		Optional<Customer> optional=customerRepo.findById(Id);
		return optional.isPresent()? optional.get(): null;
	}

	public void addCustomer(Customer customer) {
		customerRepo.save(customer);
	}
	
	

}
