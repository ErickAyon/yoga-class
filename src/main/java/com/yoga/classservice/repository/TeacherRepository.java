package com.yoga.classservice.repository;

import com.yoga.classservice.model.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface TeacherRepository extends CrudRepository<Teacher,Long> {
}
