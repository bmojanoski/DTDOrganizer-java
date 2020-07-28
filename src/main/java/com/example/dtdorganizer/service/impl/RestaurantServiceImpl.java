package com.example.dtdorganizer.service.impl;

import com.example.dtdorganizer.model.Restaurant;
import com.example.dtdorganizer.repository.RestaurantRepository;
import com.example.dtdorganizer.service.RestaurantService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantRepository restaurantRepository;

    public RestaurantServiceImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public List<Restaurant> getAllRestaurants() {
        return this.restaurantRepository.findAll();
    }

    @Override
    public Optional<Restaurant> getRestaurantById(Long id) {
        return this.restaurantRepository.findById(id);
    }

    @Override
    public Restaurant findByName(String name) {
        return this.restaurantRepository.findAllByName(name);
    }

    @Override
    public Restaurant createRestaurant(Restaurant restaurant) {
        return this.restaurantRepository.save(restaurant);
    }

    @Override
    public Restaurant updateRestaurant(Restaurant restaurant) {
        return null;
    }

    @Override
    public void deleteRestaurant(Long id) {
        this.restaurantRepository.deleteById(id);
    }
}
