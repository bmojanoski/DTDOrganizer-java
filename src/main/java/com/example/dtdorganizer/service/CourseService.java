package com.example.dtdorganizer.service;

import com.example.dtdorganizer.model.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    List<Course> getAllCourses();
    Optional<Course> getCourseById(Long id);
    Course createCourse(Course course);
    Course updateCourse(Course course);
    void deleteCourse(Long id);
}
