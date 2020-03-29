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

    //get Course
    @GetMapping("/courses")
    public List<Course> getAllCourse(){
        return this.courseService.getAllCourses();
    }

    //get Course by id
    @GetMapping("/courses/{id}")
    public Optional<Course> getCourseById(@PathVariable Long id){
        return this.courseService.getCourseById(id);
    }
    //save Course
    @PostMapping("/courses")
    public Course createCourse(@RequestBody Course course){
        return this.courseService.createCourse(course);
    }
    //update Course

    //delete Course
    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable Long id){
        this.courseService.deleteCourse(id);
    }

}
