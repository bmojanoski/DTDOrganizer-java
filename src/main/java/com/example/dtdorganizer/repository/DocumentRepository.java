package com.example.dtdorganizer.repository;

import com.example.dtdorganizer.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Long> {
}
