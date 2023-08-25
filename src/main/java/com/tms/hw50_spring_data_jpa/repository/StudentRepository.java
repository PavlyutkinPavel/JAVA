package com.tms.hw50_spring_data_jpa.repository;

import com.tms.hw50_spring_data_jpa.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findAllByGroupNumber(Integer groupNumber);

    @Query(nativeQuery = true, value = "SELECT * FROM students WHERE paid_for_studying = false")
    List<Student> findAllByPaidForStudying();

    @Query(nativeQuery = true, value = "SELECT * FROM students WHERE first_name = :fn")
    Optional<Student> findByFirstName(String fn);

    @Query(nativeQuery = true, value = "SELECT * FROM students WHERE surname = :sn")
    Optional<Student> findBySurname(String sn);
}
