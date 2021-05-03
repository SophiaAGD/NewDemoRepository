package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController //this annotation makes this class serve RESTful endpoints
@RequestMapping(path = "api/v1/student")
public class StudentController { //this class is an API layer

    private final StudentService studentService; //a private reference variable;
/*
What we've done here (dependency injection):
    We have created a StudentService instance variable studentService and added
    a constructor below, which is required to be called with the instance when
    StudentService is created
 */


    @Autowired // this annotation allows us to inject object dependencies implicitly
    //(only works with references, NO primitive types and Strings)

    public StudentController(StudentService studentService) { // here, our reference is
        //injected to this constructor, so the method below will work
        this.studentService = studentService;
    }

    @GetMapping //the only endpoint
    public List<Student> getStudents() {
        return StudentService.getStudents(); // this works due to having a reference
        // of a StudentService class
    }
}

/*HINT:
if the terminal throws an exception saying that 8080 port ia already in use,
add a statement "server.port = any_number" to your application.properties file.
*/