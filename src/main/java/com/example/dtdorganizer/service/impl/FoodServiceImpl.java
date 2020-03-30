package com.example.dtdorganizer.service.impl;

import com.example.dtdorganizer.model.Food;
import com.example.dtdorganizer.model.Order;
import com.example.dtdorganizer.repository.FoodRepository;
import com.example.dtdorganizer.repository.OrderRepository;
import com.example.dtdorganizer.service.FoodService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodServiceImpl implements FoodService {

    private FoodRepository foodRepository;

    public FoodServiceImpl(FoodRepository foodRepository){
        this.foodRepository = foodRepository;
    }


    @Override
    public List<Food> getAllFoods() {
        return this.foodRepository.findAll();
    }

    @Override
    public Optional<Food> getFoodById(Long id) {
        return this.foodRepository.findById(id);
    }

    @Override
    public Food createFood(Food food) {
        return this.foodRepository.save(food);
    }

    @Override
    public Food updateFood(Food food) {
        return null;
    }

    @Override
    public void deleteFood(Long id) {
        this.foodRepository.deleteById(id);

    }
}