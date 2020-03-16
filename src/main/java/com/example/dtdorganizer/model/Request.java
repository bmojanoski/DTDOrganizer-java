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
public class Request {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;

    public String request_name;
    @JsonIgnore
    @ManyToMany(mappedBy = "requests", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Resource> resources;

    public List<Resource> getResources() {
        return resources;
    }
}
