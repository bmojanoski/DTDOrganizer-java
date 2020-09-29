package com.example.dtdorganizer.controller;

import com.example.dtdorganizer.model.*;
import com.example.dtdorganizer.service.RequestService;
import com.example.dtdorganizer.service.ResourceService;
import com.example.dtdorganizer.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1")
//@CrossOrigin(origins = "http://localhost:3000")
public class ResourceController {

    private final ResourceService resourceService;
    private final RequestService requestService;
    private final UserService userService;

    public ResourceController(ResourceService resourceService, RequestService requestService, UserService userService) {
        this.resourceService = resourceService;
        this.requestService = requestService;
        this.userService = userService;
    }


    @GetMapping("/resources")
    public List<Resource> getAllResources() {
        return this.resourceService.getAllResources();
    }


    @GetMapping("/resources/office")
    public List<Resource> getAllOffice() {
        return this.resourceService.getAllOffice();
    }

    @GetMapping("/resources/materials")
    public List<Resource> getAllWorkMaterials() {
        return this.resourceService.getAllWorkMaterials();
    }

    @GetMapping("/resources/utilities")
    public List<Resource> getAllUtilities() {
        return this.resourceService.getAllUtilities();
    }

    @GetMapping("/resources/{id}")
    public Optional<Resource> getResourceById(@PathVariable Long id) {
        return this.resourceService.getResourcesById(id);
    }

    @PostMapping("/resources")
    public Resource createResource(@RequestBody Resource resource) {
        return this.resourceService.createResource(resource);
    }

    @GetMapping("/requests")
    public List<RequestDTO> getAllRequests() {
        List<Request> req =  this.requestService.getAllRequests();
        List<RequestDTO> requestDTOs = new ArrayList<RequestDTO>();
        RequestDTO requestDTO = new RequestDTO();
        for(Request request : req){
            requestDTO.setUser_name(request.user_name);
            requestDTO.setId(request.getId());
            requestDTO.setRequest_name(request.request_name);
            requestDTO.setResources(request.getResources());
            requestDTOs.add(requestDTO);
            requestDTO = new RequestDTO();
        }

        return requestDTOs;
    }


    @PostMapping("/resource-request")
    public void addRequest(@RequestBody ResourceDTO resourceDTO) {
        if (resourceDTO.id != null) {
            Request request = new Request();
            request.setRequest_name(resourceDTO.request_name);
            String username = this.userService.getSpecificUser(resourceDTO.user_id);
            request.setUser_name(username);
            this.requestService.createRequest(request);

            if (resourceDTO.id.size() > 1) {
                resourceDTO.id.forEach((n) -> this.resourceService.addRequest(n, request));
            } else {
                this.resourceService.addRequest(resourceDTO.id.get(0), request);
            }
        }
    }

    @DeleteMapping("/resources/{id}")
    public void deleteResource(@PathVariable Long id) {
        this.resourceService.deleteResource(id);
    }
}
