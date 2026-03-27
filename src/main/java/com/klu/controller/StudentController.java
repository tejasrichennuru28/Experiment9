package com.klu.controller;

import org.springframework.web.bind.annotation.*;
import com.klu.service.StudentService;
import com.klu.model.Student;
import com.klu.exception.InvalidInputException;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable String id) {
        try {
            int studentId = Integer.parseInt(id);
            return service.getStudentById(studentId);
        } catch (NumberFormatException e) {
            throw new InvalidInputException("Invalid ID format. Must be number.");
        }
    }
}