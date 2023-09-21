package com.yoga.classservice.service;

import com.yoga.classservice.model.Student;
import com.yoga.classservice.model.Teacher;
import com.yoga.classservice.repository.StudentRepository;
import com.yoga.classservice.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach((n)->students.add(n));
        return students;
    }

    public void addStudent(Student studentToAdd) {
        studentRepository.save(studentToAdd);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
