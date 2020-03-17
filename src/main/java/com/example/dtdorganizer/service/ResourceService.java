package com.example.dtdorganizer.service;

import com.example.dtdorganizer.model.Request;
import com.example.dtdorganizer.model.Resource;
import com.example.dtdorganizer.model.ResourceType;

import java.util.List;
import java.util.Optional;

public interface ResourceService {
    List<Resource> getAllResources();

    List<Resource> getAllOffice();
    List<Resource> getAllWorkMaterials();
    List<Resource> getAllUtilities();

    Optional<Resource> getResourcesById(Long id);
    Resource createResource(Resource resource);
    Resource updateResource(Resource resource);
    void deleteResource(Long id);
    void addRequest(Long id, Request request);
}
