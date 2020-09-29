package com.example.dtdorganizer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestDTO {
    Long id;
    public String request_name;
    public String user_name;
    public List<Resource> resources;
}
