package com.example.dtdorganizer.service.impl;

import com.example.dtdorganizer.exceptions.InvalidResourceIdException;
import com.example.dtdorganizer.model.Request;
import com.example.dtdorganizer.model.Resource;
import com.example.dtdorganizer.repository.ResourceRepository;
import com.example.dtdorganizer.service.ResourceService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResourceServiceImpl implements ResourceService {

    private ResourceRepository resourceRepository;

    public ResourceServiceImpl(ResourceRepository resourceRepository){
        this.resourceRepository = resourceRepository;
    }

    @Override
    public List<Resource> getAllResources() {
        return this.resourceRepository.findAll();
    }

    @Override
    public List<Resource> getAllOffice() {
        return this.resourceRepository.getAllByOffice();
    }

    @Override
    public List<Resource> getAllWorkMaterials() {
        return this.resourceRepository.getAllByWorkMaterials();
    }

    @Override
    public List<Resource> getAllUtilities() {
        return this.resourceRepository.getAllByUtilities();
    }


    @Override
    public Optional<Resource> getResourcesById(Long id) {
        return this.resourceRepository.findById(id);
    }

    @Override
    public Resource createResource(Resource resource) {
        return this.resourceRepository.save(resource);
    }

    @Override
    public Resource updateResource(Resource resource) {
        return null;
    }

    @Override
    public void deleteResource(Long id) {
        this.resourceRepository.deleteById(id);
    }

    @Override
    public void addRequest(Long id, Request request) {
        Resource resource1 = this.resourceRepository.findById(id).orElseThrow(InvalidResourceIdException::new);
        if(request != null){
            resource1.getRequests().add(request);
            this.resourceRepository.save(resource1);
        }
    }
}
