package com.example.demo.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service // this class is a Service Layer
public class StudentService { //this class is responsible for managing students

    private static StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public static List<Student> getStudents(){
        return studentRepository.findAll();
        // this returns a list to us
    }

    public void addNewStudent(Student student) {
        System.out.println(student);
    }
}
