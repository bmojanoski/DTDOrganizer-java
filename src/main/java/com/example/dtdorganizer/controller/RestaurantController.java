package com.example.dtdorganizer.controller;


import com.example.dtdorganizer.model.Restaurant;
import com.example.dtdorganizer.service.RestaurantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class RestaurantController {

    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping("/restaurants")
    public List<Restaurant> getAllRestaurants() {
        return this.restaurantService.getAllRestaurants();
    }

    @GetMapping("/restaurants/{id}")
    public Optional<Restaurant> getRestaurantById(@PathVariable Long id) {
        return this.restaurantService.getRestaurantById(id);
    }

    @PostMapping("/restaurants")
    public Restaurant createRestaurant(@RequestBody Restaurant restaurant) {
        return this.restaurantService.createRestaurant(restaurant);
    }

    @DeleteMapping("/restaurants/{id}")
    public void deleteRestaurant(@PathVariable Long id) {
        this.restaurantService.deleteRestaurant(id);
    }
}
