package com.example.dtdorganizer.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String name;
    int price;

    @JsonIgnore
    @ManyToMany(mappedBy = "foods", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Order> orders;

    //This implementation will be used in the next feature
    //    @JsonIgnore
    //    @ManyToMany(mappedBy = "foods", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    //    private List<Restaurant> restaurants;
}
