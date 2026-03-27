package com.klu.service;

import org.springframework.stereotype.Service;
import com.klu.model.Student;
import com.klu.exception.StudentNotFoundException;

@Service
public class StudentService {

    public Student getStudentById(int id) {
        if (id != 1) {
            throw new StudentNotFoundException("Student not found with id: " + id);
        }
        return new Student(1, "Teju");
    }
}