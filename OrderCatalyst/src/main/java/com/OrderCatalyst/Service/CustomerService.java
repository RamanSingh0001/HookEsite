package com.OrderCatalyst.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.OrderCatalyst.Exception.CustomerException;
import com.OrderCatalyst.Model.Customer;
import com.OrderCatalyst.Repository.CustomerRepository;

@Service
public class CustomerService {
	 @Autowired
	    private CustomerRepository customerRepository;

	public Customer addCustomer(Customer customer){
		if(customerRepository.existsByEmail(customer.getEmail())) {
			throw new CustomerException("Customer with this email aready exists");
		}
		 return customerRepository.save(customer);
	 }
	    public List<Customer> findCustomersWithoutOrders() {
	    	
	        return customerRepository.findByOrdersIsEmpty();
	    }
}
