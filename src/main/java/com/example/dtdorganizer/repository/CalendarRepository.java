package com.example.dtdorganizer.repository;

import com.example.dtdorganizer.model.Calendar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalendarRepository extends JpaRepository<Calendar, Long> {
}
