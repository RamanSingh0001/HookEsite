package com.OrderCatalyst.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OrderCatalyst.Model.CustomerOrder;

public interface OrderRepository extends JpaRepository<CustomerOrder,Long> {

}
