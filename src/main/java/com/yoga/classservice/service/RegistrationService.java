package com.yoga.classservice.service;

import com.yoga.classservice.model.*;
import com.yoga.classservice.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegistrationService {

    @Autowired
    EventAttendanceRepository eventAttendanceRepository;

    @Autowired
    EventTeachingRepository eventTeachingRepository;

    @Autowired
    EventRepository eventRepository;

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    TeacherRepository teacherRepository;

    public void registerStudentForEvent(Long studentId, Long eventId) {
        Student student = studentRepository.findById(studentId).get();
        Event event = eventRepository.findById(eventId).get();
        EventAttendance eventAttendance = new EventAttendance(event,student);
        eventAttendanceRepository.save(eventAttendance);
    }

    public void registerTeacherForEvent(Long teacherId, Long eventId) {
        Teacher teacher = teacherRepository.findById(teacherId).get();
        Event event = eventRepository.findById(eventId).get();
        EventTeaching eventTeaching = new EventTeaching(event,teacher);
        eventTeachingRepository.save(eventTeaching);
    }

}
