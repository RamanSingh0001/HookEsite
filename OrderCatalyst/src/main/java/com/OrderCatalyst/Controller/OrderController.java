package com.OrderCatalyst.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OrderCatalyst.Model.CustomerOrder;
import com.OrderCatalyst.Service.OrderService;
@RestController
@RequestMapping("/order")
public class OrderController {
	 @Autowired
	    private OrderService orderService;

	    @PostMapping("/add")
	    public ResponseEntity<CustomerOrder> addOrder(@RequestBody CustomerOrder order) {
	        CustomerOrder savedOrder = orderService.addOrder(order);
	        return new ResponseEntity<>(savedOrder, HttpStatus.CREATED);
	    }
}
