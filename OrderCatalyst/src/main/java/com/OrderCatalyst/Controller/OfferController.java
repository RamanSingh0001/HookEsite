package com.OrderCatalyst.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OrderCatalyst.Model.Customer;
import com.OrderCatalyst.Service.CustomerService;

@RestController
@RequestMapping("/api")
public class OfferController {
	  @Autowired 
	    private CustomerService customerService;
	  @GetMapping("/send-offers-to-customers-without-orders")
	ResponseEntity<List<Customer>> sendOffersToCustomersWithoutOrders(){
		 List<Customer> customersWithoutOrders = customerService.findCustomersWithoutOrders();
	      
	        return ResponseEntity.ok(customersWithoutOrders);
	}
	  
}
