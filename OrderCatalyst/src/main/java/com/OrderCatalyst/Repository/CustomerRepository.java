package com.OrderCatalyst.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OrderCatalyst.Model.Customer;
import com.OrderCatalyst.Model.CustomerOrder;

public interface CustomerRepository extends JpaRepository<Customer,Long>{

	List<Customer> findByOrdersIsEmpty();

	boolean existsByEmail(String email);

}
