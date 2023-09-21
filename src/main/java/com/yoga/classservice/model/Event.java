package com.yoga.classservice.model;

import javax.persistence.*;

@Entity
public class Event {
    @Id
    @GeneratedValue
    Long id;

    @OneToOne
    Teacher teacher;

    @OneToOne
    Location location;

  //  Long teacherId;

    ClassType classType = ClassType.YIN;

    String name;

    public Event() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ClassType getClassType() {
        return classType;
    }

    public void setClassType(ClassType classType) {
        this.classType = classType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(Location location) {this.location=location;}
}
