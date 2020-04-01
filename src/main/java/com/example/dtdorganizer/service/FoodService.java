package com.example.dtdorganizer.service;

import com.example.dtdorganizer.model.Food;
import com.example.dtdorganizer.model.Order;

import java.util.List;
import java.util.Optional;

public interface FoodService {
    List<Food> getAllFoods();
    Optional<Food> getFoodById(Long id);
    Optional<Food> findByNameAndPrice(String name, int price);
    Food createFood(Food order);
    Food updateFood(Food order);
    void deleteFood(Long id);

}
