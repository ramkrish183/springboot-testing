package com.rameshj.springbootapps.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class CustomerRepositoryTest {

	@Autowired
	private CustomerRepository customerRepo;
	@Autowired
	private EntityManager entityManager;
	
	@Test
	void testAllCustomersByState() {
		entityManager.persist(new Customer( "name1", "Rome Drive", "PA"));
		entityManager.persist(new Customer( "name2", "Rome Drive", "MN"));
		List<Customer> listCustomer=customerRepo.getAllCustomersByState();
		assertThat(listCustomer).hasSize(1);
		
		
	}
}
