package com.example.demo.configuration;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
                    Student julia = new Student(
                            "julia",
                            "juliakeis@gmail.com",
                            LocalDate.of(1990, JULY, 12)
                    );
                     Student noman = new Student(
                            "noman",
                            "itsnoman@gmail.com",
                            LocalDate.of(2002, NOVEMBER, 12)
                    );
                     Student timur = new Student(
                            "timur",
                            "timurunal@gmail.com",
                            LocalDate.of(1979, AUGUST, 19)
                    );

                    repository.saveAll(
                            List.of(noman, julia, timur)
                    );
        };
    }
}
