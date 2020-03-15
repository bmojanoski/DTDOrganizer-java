package com.example.dtdorganizer.service.impl;

import com.example.dtdorganizer.model.Course;
import com.example.dtdorganizer.repository.CourseRepository;
import com.example.dtdorganizer.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    private CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }
    @Override
    public List<Course> getAllCourses() {
        return this.courseRepository.findAll();
    }

    @Override
    public Optional<Course> getCourseById(Long id) {
        return this.courseRepository.findById(id);
    }

    @Override
    public Course createCourse(Course course) {
        return this.courseRepository.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return null;
    }

    @Override
    public void deleteCourse(Long id) {
        this.courseRepository.deleteById(id);
    }
}
