package com.example.easynotes.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Customer {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long idCustomer;


	@OneToMany(mappedBy="customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Session> sessions;
	
	
	
	
	
	
	public Customer() {
		super();
	}

	public Customer(long idCustomer) {
		super();
		this.idCustomer = idCustomer;
	}

	public long getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(long idCustomer) {
		this.idCustomer = idCustomer;
	}
	
	
	
	
	
	
	
	
}
