package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudentData () {
        return List.of( new Student("Tushar", "tushar.s@simplifyvms.com", 22, LocalDate.of(2000,11,25)));
    }
}
