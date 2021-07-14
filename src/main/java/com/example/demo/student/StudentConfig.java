package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;
import static java.time.Month.SEPTEMBER;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){ //this method helps us have an access to the database
        return args -> {
            Student Sophie = new Student(
                    "Sophie",
                    "sophiejinmichaelson@gmail.com",
                    LocalDate.of(2003,
                            SEPTEMBER, 10)

            );
            Student Mark = new Student(

                    "Mark",
                    "marklee2000@gmail.com",
                    LocalDate.of(2000,
                            AUGUST, 2)

            );
            Student Jeno = new Student(

                    "Jeno",
                    "leejeno23@gmail.com",
                    LocalDate.of(2000,
                            APRIL, 23)

            );
            Student William = new Student(

                    "WilliamLin",
                    "williamlin168@gmail.com",
                    LocalDate.of(2000,
                            JANUARY, 1) //random date :)

            );
           

            repository.saveAll(List.of(Sophie, Mark, Jeno, William));

        };
    }
}
