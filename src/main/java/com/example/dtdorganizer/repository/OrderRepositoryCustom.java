package com.example.dtdorganizer.repository;

import com.example.dtdorganizer.model.Order;

import java.util.List;

public interface OrderRepositoryCustom {
    List<Order> getAllFromToday();
}
