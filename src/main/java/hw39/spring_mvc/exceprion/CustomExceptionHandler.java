package hw39.spring_mvc.exceprion;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.IOException;
import java.sql.SQLException;

@ControllerAdvice
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CustomExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler({NullPointerException.class, IOException.class, SQLException.class})
    public String myExceptionHandler(Exception e){
        System.out.println(e);
        return "error-page";
    }
}
