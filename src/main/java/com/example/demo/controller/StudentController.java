package com.example.demo.controller;

import com.example.demo.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/student")
    public ResponseEntity<Student> getStudent() {
        Student student = new Student(1, "Bhaskar", "R");
        return ResponseEntity.ok(student);
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(2, "Abc", "xyz"));
        students.add(new Student(3, "MS", "Dhoni"));
        students.add(new Student(4, "virat", "kohli"));
        return students;
    }

    @GetMapping("student/{id}/{first-name}/{last-name}")
    public Student getStudentPath(@PathVariable int id,
                                  @PathVariable("first-name") String firstName,
                                  @PathVariable("last-name") String lastName) {
        return new Student(id, firstName,lastName );
    }

    @GetMapping("student/query")
    public Student queryStudent(@RequestParam int id){
        return new Student(1,"Ramesh","Suresh");
    }

    @PostMapping("student/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Student create(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return student;
    }

}
