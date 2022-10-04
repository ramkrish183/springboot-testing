/**
 * 
 */
package com.rameshj.springbootapps.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rameshj.springbootapps.repository.Customer;

/**
 * @author Ramesh
 *
 */

@Service
@Transactional
public interface CustomerService {

	public List<Customer> getAllCustomers();

	public Customer findCustomer(int Id);

	public void addCustomer(Customer customer);
	
	public List<Customer> getAllCustomersByState();

}
