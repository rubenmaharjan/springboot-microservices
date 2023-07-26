package com.rubenmaharjan.orderservice.repository;


import com.rubenmaharjan.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
