package com.example.dtdorganizer.repository;

import com.example.dtdorganizer.model.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Long>, ResourceRepositoryCustom {


}
