package com.example.dtdorganizer.repository;

import com.example.dtdorganizer.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long>, OrderRepositoryCustom {
}
