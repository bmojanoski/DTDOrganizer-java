package com.example.dtdorganizer.service.impl;

import com.example.dtdorganizer.model.Request;
import com.example.dtdorganizer.repository.RequestRepository;
import com.example.dtdorganizer.service.RequestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestServiceImpl implements RequestService {

    private final RequestRepository requestRepository;

    public RequestServiceImpl(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    @Override
    public Request createRequest(Request request) {
        return this.requestRepository.save(request);
    }

    @Override
    public List<Request> getAllRequests() {
        return this.requestRepository.findAll();
    }

    @Override
    public void deleteRequest(Long id) {
        this.requestRepository.deleteById(id);
    }
}
