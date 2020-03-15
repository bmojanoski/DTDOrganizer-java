package com.example.dtdorganizer.controller;

import com.example.dtdorganizer.model.Course;
import com.example.dtdorganizer.model.Document;
import com.example.dtdorganizer.service.CourseService;
import com.example.dtdorganizer.service.DocumentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class DocumentController {

    private final DocumentService documentService;

    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    //get Course
    @GetMapping("/documents")
    public List<Document> getAllCourse(){
        return this.documentService.getAllDocuments();
    }

    //get Course by id
    @GetMapping("/documents/{id}")
    public Optional<Document> getCourseById(@PathVariable Long id){
        return this.documentService.getDocumentById(id);
    }
    //save Course
    @PostMapping("/documents")
    public Document createCourse(@RequestBody Document document){
        return this.documentService.createDocument(document);
    }
    //update user

    //delete Course
    @DeleteMapping("/documents/{id}")
    public void deleteCourse(@PathVariable Long id){
        this.documentService.deleteDocument(id);
    }
}
