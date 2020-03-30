package com.example.dtdorganizer.controller;


import com.example.dtdorganizer.model.Order;
import com.example.dtdorganizer.model.Restaurant;
import com.example.dtdorganizer.service.OrderService;
import com.example.dtdorganizer.service.RestaurantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    //get orders
    @GetMapping("/orders")
    public List<Order> getAllOrders(){
        return this.orderService.getAllFromToday();
    }

    //get orders by date
    @GetMapping("/orders/")
    public List<Order> getTodayOrders(){
        return this.orderService.getAllOrders();
    }

    //get orders by id
    @GetMapping("/orders/{id}")
    public Optional<Order> getOrderById(@PathVariable Long id){
        return this.orderService.getOrderById(id);
    }
    //save orders
    @PostMapping("/orders")
    public Order createOrder(@RequestBody Order order){
        return this.orderService.createOrder(order);
    }
    //update orders

    //delete orders
    @DeleteMapping("/orders/{id}")
    public void deleteOrder(@PathVariable Long id){
        this.orderService.deleteOrder(id);
    }

}
