package com.example.dtdorganizer.repository;

import com.example.dtdorganizer.model.Resource;
import com.example.dtdorganizer.model.ResourceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Long>, ResourceRepositoryCustom {


}
