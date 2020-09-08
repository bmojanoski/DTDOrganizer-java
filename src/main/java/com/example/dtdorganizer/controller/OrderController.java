package com.example.dtdorganizer.controller;


import com.example.dtdorganizer.exceptions.InvalidFoodNameAndPriceException;
import com.example.dtdorganizer.exceptions.InvalidRestaurantIdException;
import com.example.dtdorganizer.model.Food;
import com.example.dtdorganizer.model.Order;
import com.example.dtdorganizer.model.Restaurant;
import com.example.dtdorganizer.service.FoodService;
import com.example.dtdorganizer.service.OrderService;
import com.example.dtdorganizer.service.RestaurantService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class OrderController {

    private final OrderService orderService;
    private final RestaurantService restaurantService;
    private final FoodService foodService;

    public OrderController(OrderService orderService,
                           RestaurantService restaurantService,
                           FoodService foodService) {

        this.orderService = orderService;
        this.restaurantService = restaurantService;
        this.foodService = foodService;
    }


    @GetMapping("/orders")
    public List<Order> getAllOrders() {
        return this.orderService.getAllFromToday();
    }


    @GetMapping("/orders/")
    public List<Order> getTodayOrders() {
        return this.orderService.getAllOrders();
    }


    @GetMapping("/orders/{id}")
    public Optional<Order> getOrderById(@PathVariable Long id) {
        return this.orderService.getOrderById(id);
    }


    @PostMapping("/orders")
    public Order createOrder(@RequestBody Order order) {

        for (Food food : order.getFoods()) {
            Optional<Food> findFood = this.foodService.findByNameAndPrice(food.getName(), food.getPrice());
            if (!findFood.isPresent()) {
                this.foodService.createFood(food);
            }
        }

        List<Food> foods = new ArrayList<>();
        for (Food food : order.getFoods()) {
            Food newFood = this.foodService.findByNameAndPrice(food.getName(), food.getPrice()).orElseThrow(InvalidFoodNameAndPriceException::new);
            if (newFood != null)
                foods.add(newFood);
        }

        Order newOrder = new Order();
        Restaurant restaurant = this.restaurantService.findByName(order.getRestaurant().getName());
        newOrder.setDate(order.date);
        newOrder.setEmployee(order.employee);
        newOrder.setDescription(order.description);
        newOrder.setPrice(order.price);
        newOrder.setRestaurant(restaurant);
        newOrder.setFoods(foods);

        return this.orderService.createOrder(newOrder);
    }

    @DeleteMapping("/orders/{id}")
    public void deleteOrder(@PathVariable Long id) {
        this.orderService.deleteOrder(id);
    }

}
