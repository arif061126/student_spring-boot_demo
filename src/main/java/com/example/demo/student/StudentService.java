package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

/**
 * 2nd step: make relative service class
 * annotated with component or Service
 */

@Service
public class StudentService {
    //inside the class define a method what i want to see in the browser.
    public List<Student> getStudent(){
        return List.of(
                new Student(
                    "Arif",
                    "arif@gmail.com",
                     LocalDate.of(2022, Month.APRIL,21),
                     21
                )
        );
    }
}
