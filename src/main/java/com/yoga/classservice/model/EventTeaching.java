package com.yoga.classservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class EventTeaching {

    @Id
    @GeneratedValue
    Long id;

    @OneToOne
    Teacher teacher;

    @OneToOne
    Event event_;

    public EventTeaching(Event event, Teacher teacher) {
        this.event_ = event;
        this.teacher = teacher;
    }

    public EventTeaching() {}

    public Long getId() {
        return id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Event getEvent_() {
        return event_;
    }
}
