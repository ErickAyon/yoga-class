package com.yoga.classservice.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Location {
    @Id
    @GeneratedValue
    long id;

    String name;

    @ManyToOne
    Event event_;

    public Location() {}

    public long getId() {return this.id;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Event getEvent_() {
        return event_;
    }

    public void setEvent_(Event event_) {
        this.event_ = event_;
    }
}
