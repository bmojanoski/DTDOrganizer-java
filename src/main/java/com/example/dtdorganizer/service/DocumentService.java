package com.example.dtdorganizer.service;

import com.example.dtdorganizer.model.Document;

import java.util.List;
import java.util.Optional;

public interface DocumentService {
    List<Document> getAllDocuments();
    Optional<Document> getCDocumentById(Long id);
    Document createDocument(Document course);
    Document updateDocument(Document course);
    void deleteDocument(Long id);
}
