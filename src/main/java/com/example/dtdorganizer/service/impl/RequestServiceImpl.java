package com.example.dtdorganizer.service.impl;

import com.example.dtdorganizer.model.Request;
import com.example.dtdorganizer.repository.RequestRepository;
import com.example.dtdorganizer.service.RequestService;
import org.springframework.stereotype.Service;

@Service
public class RequestServiceImpl implements RequestService {

    private RequestRepository requestRepository;

    public RequestServiceImpl(RequestRepository requestRepository){
        this.requestRepository = requestRepository;
    }

    @Override
    public Request createRequest(Request request) {
        return this.requestRepository.save(request);
    }
}
