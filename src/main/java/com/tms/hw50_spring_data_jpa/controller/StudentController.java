package com.tms.hw50_spring_data_jpa.controller;

import com.tms.hw50_spring_data_jpa.domain.Student;
import com.tms.hw50_spring_data_jpa.service.StudentService;
import com.tms.hw50_spring_data_jpa.exception.StudentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{group}")
    public ResponseEntity<List<Student>> getStudentsByGroup(@PathVariable Integer group){
        List<Student> students = studentService.getStudentsFromOneGroup(group);
        if (students.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(students, HttpStatus.OK);
        }
    }

    @GetMapping("/finances/debtors") //должники
    public ResponseEntity<List<Student>> getStudentsDebtors(){
        List<Student> students = studentService.getStudentsDebtors();
        if (students.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(students, HttpStatus.OK);
        }
    }

    @GetMapping("/all/firstName/{firstName}")
    public ResponseEntity<Student> getUserByFirstName(@PathVariable String firstName) {
        Student student = studentService.getStudentByFirstName(firstName).orElseThrow(StudentNotFoundException::new);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @GetMapping("/all/surname/{surname}")
    public ResponseEntity<Student> getUserBySurname(@PathVariable String surname) {
        Student student = studentService.getStudentBySurname(surname).orElseThrow(StudentNotFoundException::new);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<HttpStatus> updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteStudent(@PathVariable Integer id) {
        studentService.deleteStudentById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping
    public ResponseEntity<HttpStatus> createStudent(@RequestBody Student student) {
        studentService.createStudent(student);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HttpStatus> changeStudentGroupNumber(@PathVariable Integer id, @RequestParam("new_group") Integer new_group) {
        studentService.updateGroupNumber(id, new_group);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
