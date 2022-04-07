package com.example.demo.student;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private int id;
    private String studentName;
    private String studentEmail;
    private LocalDate studentDOB;
    private int studentAge;

    public Student() {
    }

    public Student(String studentName,
                   String studentEmail,
                   LocalDate studentDOB,
                   int studentAge) {
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentDOB = studentDOB;
        this.studentAge = studentAge;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public LocalDate getStudentDOB() {
        return studentDOB;
    }

    public void setStudentDOB(LocalDate studentDOB) {
        this.studentDOB = studentDOB;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", studentDOB=" + studentDOB +
                ", studentAge=" + studentAge +
                '}';
    }
}
