package com.example.dtdorganizer.controller;

import com.example.dtdorganizer.model.Request;
import com.example.dtdorganizer.model.Resource;
import com.example.dtdorganizer.model.ResourceDTO;
import com.example.dtdorganizer.service.RequestService;
import com.example.dtdorganizer.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class ResourceController {
    @Autowired
    private ResourceService resourceService ;

    @Autowired
    private RequestService requestService ;


    //get Course
    @GetMapping("/resources")
    public List<Resource> getAllCourse(){
        return this.resourceService.getAllResources();
    }

    //get Course by id
    @GetMapping("/resources/{id}")
    public Optional<Resource> getResourceById(@PathVariable Long id){
        return this.resourceService.getResourcesById(id);
    }
    //save Course
    @PostMapping("/resources")
    public Resource createCourse(@RequestBody Resource resource){
        return this.resourceService.createResource(resource);
    }

    //add request for specific resource
    @PostMapping("/resource-request")
        public void addRequest(@RequestBody ResourceDTO resourceDTO){
        int i = 0;
        Request request = new Request();
        request.setRequest_name(resourceDTO.request_name);
        this.requestService.createRequest(request);

        if(resourceDTO.id.size()>1){
            resourceDTO.id.forEach((n) -> this.resourceService.addRequest(n,request) );
        }
        else{
            this.resourceService.addRequest(resourceDTO.id.get(0),request);
        }
    }

    //update user

    //delete Course
    @DeleteMapping("/resources/{id}")
    public void deleteResource(@PathVariable Long id){
        this.resourceService.deleteResource(id);
    }
}
