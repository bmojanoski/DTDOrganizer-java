package com.example.dtdorganizer.service.impl;

import com.example.dtdorganizer.model.Document;
import com.example.dtdorganizer.repository.DocumentRepository;
import com.example.dtdorganizer.service.DocumentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentServiceImpl implements DocumentService {

    private final DocumentRepository documentRepository;

    public DocumentServiceImpl(DocumentRepository documentRepository){
        this.documentRepository = documentRepository;
    }

    @Override
    public List<Document> getAllDocuments() {
        return this.documentRepository.findAll();
    }

    @Override
    public Optional<Document> getDocumentById(Long id) {
        return  this.documentRepository.findById(id);
    }

    @Override
    public Document createDocument(Document course) {
        return this.documentRepository.save(course);
    }

    @Override
    public Document updateDocument(Document course) {
        return null;
    }

    @Override
    public void deleteDocument(Long id) {
        this.documentRepository.deleteById(id);
    }
}
