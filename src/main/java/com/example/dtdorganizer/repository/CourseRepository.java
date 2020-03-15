package com.example.dtdorganizer.repository;

import com.example.dtdorganizer.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
