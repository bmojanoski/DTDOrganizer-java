package com.example.dtdorganizer.service.impl;

import com.example.dtdorganizer.exceptions.InvalidRestaurantIdException;
import com.example.dtdorganizer.model.Food;
import com.example.dtdorganizer.model.Order;
import com.example.dtdorganizer.model.Restaurant;
import com.example.dtdorganizer.repository.FoodRepository;
import com.example.dtdorganizer.repository.OrderRepository;
import com.example.dtdorganizer.repository.RestaurantRepository;
import com.example.dtdorganizer.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;
    private RestaurantRepository restaurantRepository;
    private FoodRepository foodRepository;

    public OrderServiceImpl(OrderRepository orderRepository,
                            RestaurantRepository restaurantRepository,
                            FoodRepository foodRepository)
    {
        this.orderRepository = orderRepository;
        this.restaurantRepository = restaurantRepository;
        this.foodRepository = foodRepository;
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
