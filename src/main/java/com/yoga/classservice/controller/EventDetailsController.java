package com.yoga.classservice.controller;

import com.yoga.classservice.model.Event;
import com.yoga.classservice.model.Student;
import com.yoga.classservice.model.requestwrapper.EventCreationRequest;
import com.yoga.classservice.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventDetailsController {

    @Autowired
    EventService eventService;

    @RequestMapping({"/{eventId}"})
    public Event getEvent(@PathVariable("eventId") Long eventId) {
        return  eventService.getEventById(eventId);
    }

    @RequestMapping({"/{eventId}/students"})
    public List<Student> getStudentsInClass(@PathVariable("eventId") Long eventId) {
        return eventService.getStudentsByClass(eventService.getEventById(eventId));
    }

    @RequestMapping("/in/{locationId}")
    public List<Event> getEventsByID(@PathVariable("locationId") Long locationId) {
        return eventService.getEventsByLocation(locationId);
    }

    @GetMapping
    public List<Event> getEvents() {
        return eventService.getAllEvents();
    }

    @PostMapping
    public void addEvent(@RequestBody EventCreationRequest event) {
        try {
            eventService.createEvent(event);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
