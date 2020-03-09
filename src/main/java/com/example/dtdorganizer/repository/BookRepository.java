package com.example.dtdorganizer.repository;

import com.example.dtdorganizer.model.BookModel;
import com.example.dtdorganizer.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookModel,String> {
}
