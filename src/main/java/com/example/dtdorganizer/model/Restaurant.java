package com.example.dtdorganizer.model;


import com.example.dtdorganizer.model.enums.PriceRange;
import com.example.dtdorganizer.model.enums.ResourceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Restaurant {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;

    public String name;

    public PriceRange priceRange;

    public String image;

    @OneToMany(mappedBy = "restaurant")
    private List<Order> orderList;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinTable(
            name = "restaurant_food",
            joinColumns = @JoinColumn(name = "restaurant_id" , referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "food_id", referencedColumnName = "id"))
    List<Food> foods;

}
