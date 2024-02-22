package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student gaby = new Student(
                    "Gaby",
                    "gaby_escolar@gmail.com",
                    LocalDate.of(2000, Month.DECEMBER, 7)
            );
//            Different Student
            Student alex = new Student(
                    "Alex",
                    "alex_escolar@gmail.com",
                    LocalDate.of(2007, Month.DECEMBER, 7)
            );
            repository.saveAll(
                    List.of(gaby,alex)
            );
        };
    }

}
