package com.example.dtdorganizer.model;

import com.example.dtdorganizer.model.enums.PriceRange;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "order_table")
public class Order {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;

    public String name;

    public int price;

    public String Description;

    public String date;

    @ManyToOne
    @JoinColumn(name="restaurant_id", nullable = false)
    private Restaurant restaurant;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinTable(
            name = "order_food",
            joinColumns = @JoinColumn(name = "order_id" , referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "food_id", referencedColumnName = "id"))
    List<Food> foods;
}

