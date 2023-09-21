package com.yoga.classservice.repository;

import com.yoga.classservice.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Long> {
}
