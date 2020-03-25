package com.example.dtdorganizer.service;

import com.example.dtdorganizer.model.Calendar;

import java.util.List;
import java.util.Optional;

public interface CalendarService {
    List<Calendar> getAllEvents();
    Optional<Calendar> getEventById(Long id);
    Calendar createEvent(Calendar calendar);
    Calendar updateEvent(Calendar calendar);
    void deleteEvent(Long id);
}
