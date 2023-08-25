package com.tms.hw50_spring_data_jpa.service;

import com.tms.hw50_spring_data_jpa.domain.Student;
import com.tms.hw50_spring_data_jpa.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudentsFromOneGroup(Integer group){
        return studentRepository.findAllByGroupNumber(group);
    }
    public List<Student> getStudentsDebtors(){
        return studentRepository.findAllByPaidForStudying();
    }

    public Optional<Student> getStudentByFirstName(String firstName){
        return studentRepository.findByFirstName(firstName);
    }

    public Optional<Student> getStudentBySurname(String surname){
        return studentRepository.findBySurname(surname);
    }

    public void createStudent(Student student) {
        studentRepository.save(student);
    }

    public void updateStudent(Student student) {
        studentRepository.saveAndFlush(student);
    }

    public void deleteStudentById(Integer id){
        studentRepository.deleteById(id);
    }

    public void updateGroupNumber(Integer studentId, Integer newGroupNumber) {
        Optional<Student> optionalStudent = studentRepository.findById(studentId);
        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            student.setGroupNumber(newGroupNumber);
            studentRepository.save(student);
        }
    }
}
