package com.example.dtdorganizer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Document {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long id;

    public String document_name;

    public String link;
}
