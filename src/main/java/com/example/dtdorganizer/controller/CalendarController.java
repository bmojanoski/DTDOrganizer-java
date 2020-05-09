package com.example.dtdorganizer.controller;

import com.example.dtdorganizer.model.Calendar;
import com.example.dtdorganizer.model.Resource;
import com.example.dtdorganizer.repository.CalendarRepository;
import com.example.dtdorganizer.service.CalendarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class CalendarController {

    private final CalendarService calendarService;

    public CalendarController(CalendarService calendarService){
        this.calendarService = calendarService;
    }

    @GetMapping("/calendar")
    public List<Calendar> getAllEvents() {
        return this.calendarService.getAllEvents();
    }

    @PostMapping("/calendar")
    public Calendar createEvent(@RequestBody Calendar event) {
        return this.calendarService.createEvent(event);
    }

    @PutMapping("/calendar/{id}")
    public Calendar updateEvent(@RequestBody Calendar event){
        return this.calendarService.updateEvent(event);
    }

    @DeleteMapping("/calendar/{id}")
    public void deleteEvent(@PathVariable Long id){
        this.calendarService.deleteEvent(id);
    }


}
