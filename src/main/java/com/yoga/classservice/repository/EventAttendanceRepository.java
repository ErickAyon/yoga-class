package com.yoga.classservice.repository;

import com.yoga.classservice.model.EventAttendance;
import com.yoga.classservice.model.Student;
import com.yoga.classservice.model.Event;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EventAttendanceRepository extends CrudRepository<EventAttendance,Long> {
    public List<EventAttendance> getAllByEventEquals(Event event);
}
