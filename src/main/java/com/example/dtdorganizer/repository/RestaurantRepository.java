package com.example.dtdorganizer.repository;


import com.example.dtdorganizer.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    Restaurant findAllByName(String name);
}
