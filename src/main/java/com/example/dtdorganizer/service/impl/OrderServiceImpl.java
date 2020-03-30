package com.example.dtdorganizer.service.impl;

import com.example.dtdorganizer.model.Order;
import com.example.dtdorganizer.repository.OrderRepository;
import com.example.dtdorganizer.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> getAllOrders() {
        return this.orderRepository.findAll();
    }

    @Override
    public Optional<Order> getOrderById(Long id) {
        return this.orderRepository.findById(id);
    }

    @Override
    public Order createOrder(Order order) {
        return this.orderRepository.save(order);
    }

    @Override
    public Order updateOrder(Order order) {
        return null;
    }

    @Override
    public void deleteOrder(Long id) {
        this.orderRepository.deleteById(id);
    }

    @Override
    public List<Order> getAllFromToday() {
        return this.orderRepository.getAllFromToday();
    }
}
