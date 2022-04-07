package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * first step: to make a controller class
 */

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    /**
     * 3rd step: declare service class instance
     */
    @Autowired
    private final StudentService studentService;

    /**
     * 4th step: make constructor
     * @param studentService
     */

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    /**
     * step 5: call that method of service with the help of service instance and then return it.
     * @return
     */

    @GetMapping
    public List<Student> getStudent(){
        return studentService.getStudent();
    }
}
