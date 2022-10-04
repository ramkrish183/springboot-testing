package com.rameshj.springbootapps.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="customer_id_generator")
	@SequenceGenerator(name="customer_id_generator", sequenceName="customer_id_seq")
	private int id;
	@Column(nullable=false,unique=true)
	private String name;
	@Column(nullable=false,unique=false)
	private String address;
	@Column(nullable=false,unique=false)
	private String stateCode;
	
	public Customer() {
	}

	public Customer(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public Customer(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	

	public Customer(String name, String address, String stateCode) {
		this.name = name;
		this.address = address;
		this.stateCode = stateCode;
	}

	public Customer(int id, String name, String address, String stateCode) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.stateCode = stateCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

}
