package com.example.dtdorganizer.repository;

import com.example.dtdorganizer.model.Food;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

@org.springframework.stereotype.Repository
public interface FoodRepositoryCustom extends Repository<Food, Long> {

    @Query("SELECT f FROM Food f where f.name = :name AND f.price = :price")
    public Optional<Food> findByNameAndPrice(@Param("name") String title,
                                             @Param("price") int price);
}
