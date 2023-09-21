package com.yoga.classservice.controller;


import com.yoga.classservice.model.Event;
import com.yoga.classservice.model.Student;
import com.yoga.classservice.model.Teacher;
import com.yoga.classservice.service.EventService;
import com.yoga.classservice.service.StudentService;
import com.yoga.classservice.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @Autowired
    EventService eventService;

    @PostMapping
    public void addTeacher(@RequestBody Teacher teacher) {
        teacherService.addTeacher(teacher);
    }

    @GetMapping
    public List<Teacher> getTeachers() {
        return teacherService.getAllTeachers();
    }

    @RequestMapping("/{teacherId}")
    public Teacher getTeacher(@PathVariable Long teacherId){
        return teacherService.getTeacher(teacherId);
    }

    @RequestMapping("/{teacherId}/events")
    public List<Event> getEventsByTeacherId(@PathVariable Long teacherId) {
        return teacherService.getEventsByTeacherId(teacherId);
    }
}
