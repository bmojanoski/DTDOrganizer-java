package com.example.dtdorganizer.service;

import com.example.dtdorganizer.model.Request;
import com.example.dtdorganizer.model.Resource;

import java.util.List;

public interface RequestService {
    Request createRequest(Request request);
    List<Request> getAllRequests();
    void deleteRequest(Long id);

}
