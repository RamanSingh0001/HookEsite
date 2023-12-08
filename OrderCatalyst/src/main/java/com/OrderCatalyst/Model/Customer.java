package com.OrderCatalyst.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long customerId;
	
	private String customerName;
	@NotNull(message = "please enter email")
	private String email;
	
	@OneToMany(mappedBy = "customer")
	private List<CustomerOrder> orders;
	
}
