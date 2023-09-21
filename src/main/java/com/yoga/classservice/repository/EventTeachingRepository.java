package com.yoga.classservice.repository;

import com.yoga.classservice.model.EventTeaching;
import com.yoga.classservice.model.Teacher;
import com.yoga.classservice.model.Event;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EventTeachingRepository extends CrudRepository<EventTeaching,Long> {
    public List<Event> getClassByTeacher(Teacher teacher);

    List<EventTeaching> getAllByTeacherEquals(Teacher teacher);
}
