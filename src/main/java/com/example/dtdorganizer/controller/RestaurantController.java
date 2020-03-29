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

    private  RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService){
        this.restaurantService = restaurantService;
    }

    //get restaurants
    @GetMapping("/restaurants")
    public List<Restaurant> getAllRestaurants(){
        return this.restaurantService.getAllRestaurants();
    }

    //get restaurants by id
    @GetMapping("/restaurants/{id}")
    public Optional<Restaurant> getRestaurantById(@PathVariable Long id){
        return this.restaurantService.getRestaurantById(id);
    }
    //save restaurants
    @PostMapping("/restaurants")
    public Restaurant createRestaurant(@RequestBody Restaurant restaurant){
        return this.restaurantService.createRestaurant(restaurant);
    }
    //update restaurants

    //delete restaurants
    @DeleteMapping("/restaurants/{id}")
    public void deleteRestaurant(@PathVariable Long id){
        this.restaurantService.deleteRestaurant(id);
    }

}
