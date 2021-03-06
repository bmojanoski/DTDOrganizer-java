package com.example.dtdorganizer.controller;

import com.example.dtdorganizer.model.Book;
import com.example.dtdorganizer.model.Course;
import com.example.dtdorganizer.service.BookService;
import com.example.dtdorganizer.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/courses")
    public List<Course> getAllCourse() {
        return this.courseService.getAllCourses();
    }

    @GetMapping("/courses/{id}")
    public Optional<Course> getCourseById(@PathVariable Long id) {
        return this.courseService.getCourseById(id);
    }

    @PostMapping("/courses")
    public Course createCourse(@RequestBody Course course) {
        return this.courseService.createCourse(course);
    }

    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable Long id) {
        this.courseService.deleteCourse(id);
    }

}
