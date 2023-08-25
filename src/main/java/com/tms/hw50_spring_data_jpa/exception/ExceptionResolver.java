package com.tms.hw50_spring_data_jpa.exception;

import jakarta.persistence.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class ExceptionResolver {
    @ExceptionHandler(value = StudentNotFoundException.class)
    ResponseEntity<HttpStatus> userNotFoundException(){
        log.info("StudentNotFound exception!!!");
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = IllegalArgumentException.class)
    ResponseEntity<HttpStatus> illegalArgumentException(){
        log.info("IllegalArgument exception!!!");
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = OptimisticLockingFailureException.class)
    ResponseEntity<HttpStatus> optimisticLockingFailureException(){
        log.info("OptimisticLockingFailure exception!!!");
        return new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    @ExceptionHandler(value = EntityNotFoundException.class)
    ResponseEntity<HttpStatus> entityNotFoundException(){
        log.info("EntityNotFoundException exception!!!");
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
