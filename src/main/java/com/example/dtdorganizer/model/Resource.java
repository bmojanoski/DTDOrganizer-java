package com.example.dtdorganizer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Resource {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;

    public String name;

    public int qty;

    public String description;

    public String image;

    public ResourceType resourceType;


    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinTable(
            name = "resource_request",
            joinColumns = @JoinColumn(name = "resource_id" , referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "request_id", referencedColumnName = "id"))
    List<Request> requests;

}

