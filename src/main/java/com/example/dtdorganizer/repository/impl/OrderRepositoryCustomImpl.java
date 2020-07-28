package com.example.dtdorganizer.repository.impl;


import com.example.dtdorganizer.model.Order;

import com.example.dtdorganizer.repository.OrderRepositoryCustom;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public class OrderRepositoryCustomImpl implements OrderRepositoryCustom {

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public List<Order> getAllFromToday() {
        String date = java.time.LocalDate.now().toString();
        Query query = entityManager.createNativeQuery(
                "select * from order_table as O " +
                        "where cast(O.DATE as text) like ?", Order.class);
        query.setParameter(1, date + "%");
        return query.getResultList();
    }
}
