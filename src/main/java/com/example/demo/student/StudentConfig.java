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
           

            repository.saveAll(List.of(Sophie));

        };
    }
}
