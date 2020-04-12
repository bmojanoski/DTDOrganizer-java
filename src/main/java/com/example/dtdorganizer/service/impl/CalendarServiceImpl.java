package com.example.dtdorganizer.service.impl;

import com.example.dtdorganizer.exceptions.InvalidEventException;
import com.example.dtdorganizer.model.Calendar;
import com.example.dtdorganizer.repository.CalendarRepository;
import com.example.dtdorganizer.service.CalendarService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalendarServiceImpl implements CalendarService {

    private CalendarRepository calendarRepository;

    public CalendarServiceImpl(CalendarRepository calendarRepository){
        this.calendarRepository = calendarRepository;
    }

    @Override
    public List<Calendar> getAllEvents() {
        return this.calendarRepository.findAll();
    }

    @Override
    public Optional<Calendar> getEventById(Long id) {
        return this.calendarRepository.findById(id);
    }

    @Override
    public Calendar createEvent(Calendar calendar) {
        return this.calendarRepository.save(calendar);
    }

    @Override
    public Calendar updateEvent(Calendar calendar) {
        Calendar event =this.calendarRepository.findById(calendar.id).orElseThrow(InvalidEventException::new);
        event.setAllDay(calendar.allDay);
        event.setStart_date(calendar.start_date);
        event.setEnd_date(calendar.end_date);
        event.setColor(calendar.color);
        event.setDescription(calendar.description);
        event.setCalendarEventType(calendar.calendarEventType);
        event.setTitle(calendar.title);
        return this.calendarRepository.save(event);
    }

    @Override
    public void deleteEvent(Long id) {
        this.calendarRepository.deleteById(id);
    }
}
