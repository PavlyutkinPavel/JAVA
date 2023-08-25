package com.tms.hw50_spring_data_jpa.exception;

public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException() {
        super("Student not found !");
    }
}
