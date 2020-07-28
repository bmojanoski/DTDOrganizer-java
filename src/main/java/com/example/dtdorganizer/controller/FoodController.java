package com.example.dtdorganizer.controller;

import com.example.dtdorganizer.model.Food;
import com.example.dtdorganizer.model.Resource;
import com.example.dtdorganizer.service.FoodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class FoodController {

    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping("/food")
    public Optional<Food> getAllFoods(@RequestParam String name, @RequestParam int price) {
        return this.foodService.findByNameAndPrice(name, price);
    }

    @GetMapping("/foods")
    public List<Food> getAllFoods() {
        return this.foodService.getAllFoods();
    }

    @PostMapping("/food")
    public Food createFood(@RequestBody List<Food> foods) {
        return this.foodService.createFood(foods.get(0));
    }
}
