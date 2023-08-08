package com.example.demo.student;

import jakarta.persistence.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "student")
public class Student {

    private String name;
    private String email;
    private int age;
    @Id
    private Long id;
    private LocalDate DOB;


    public Student() {

    }

    public Student(String name, String email, int age, Long id, LocalDate DOB) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.id = id;
        this.DOB = DOB;
    }

    public Student(String name, String email, int age, LocalDate DOB) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.DOB = DOB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", ide=" + id +
                ", DOB=" + DOB +
                '}';
    }
}
