package com.tms.hw42_freemarker_thymeleaf.repository;

import com.tms.hw42_freemarker_thymeleaf.domain.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> findAll();
    Student findById(Long id);
    void save(Student student);
    void deleteById(Long id);
}
