package com.OrderCatalyst.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OrderCatalyst.Model.Customer;
import com.OrderCatalyst.Repository.CustomerRepository;
import com.OrderCatalyst.Service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
  @Autowired
  CustomerService customerService;
  @PostMapping("/add")
	ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
		 Customer cs=customerService.addCustomer(customer);
		 return new ResponseEntity<>(cs, HttpStatus.CREATED);
	}
}
