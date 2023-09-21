package com.yoga.classservice.service;

import com.yoga.classservice.model.*;
import com.yoga.classservice.repository.EventTeachingRepository;
import com.yoga.classservice.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    @Autowired
    EventTeachingRepository teachingRepository;

    public List<Teacher> getAllTeachers() {
        List<Teacher> teachers = new ArrayList<>();
        teacherRepository.findAll().forEach((n)->teachers.add(n));
        return teachers;
    }

    public void addTeacher(Teacher teacherToAdd) {
        teacherRepository.save(teacherToAdd);
    }

    public Teacher getTeacher(Long teacherId) { return teacherRepository.findById(teacherId).get();}

    public void updateTeacher(Teacher teacherToUpdate) {
        teacherRepository.save(teacherToUpdate);
    }

    public void deleteTeacher(Long id) {
        teacherRepository.deleteById(id);
    }

    public List<Event> getEventsByTeacherId(Long teacherId) {
        Teacher teacher = teacherRepository.findById(teacherId).get();
        List<EventTeaching> eventTeachings = teachingRepository.getAllByTeacherEquals(teacher);
        List<Event> events = new ArrayList<Event>();
        eventTeachings.forEach((n)->events.add(n.getEvent_()));
        return events;
    }
}
