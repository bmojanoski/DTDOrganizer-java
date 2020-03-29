package com.example.dtdorganizer.repository;

import com.example.dtdorganizer.model.Food;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
