package com.example.dtdorganizer.model;

import com.example.dtdorganizer.model.enums.CalendarEventType;
import com.example.dtdorganizer.model.enums.Color;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Calendar {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Long id;

    public String title;

    public String start_date;

    public String end_date;

    public String description;

    public Color color;

    public boolean allDay;

        public CalendarEventType calendarEventType;
}
