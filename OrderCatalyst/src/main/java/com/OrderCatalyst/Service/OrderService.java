package com.OrderCatalyst.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OrderCatalyst.Model.CustomerOrder;
import com.OrderCatalyst.Repository.OrderRepository;
@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    
    public CustomerOrder addOrder(CustomerOrder order) {  
        return orderRepository.save(order);
}
}
