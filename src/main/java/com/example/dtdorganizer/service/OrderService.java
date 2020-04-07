package com.example.dtdorganizer.service;

import com.example.dtdorganizer.model.Food;
import com.example.dtdorganizer.model.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    List<Order> getAllOrders();
    Optional<Order> getOrderById(Long id);
    Order createOrder(Order order);
    Order updateOrder(Order order);
    void deleteOrder(Long id);
    List<Order> getAllFromToday();
}
