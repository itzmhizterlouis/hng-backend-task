package com.hng.hng_backend_task.exceptions.handler;

import com.hng.hng_backend_task.entities.responses.Task2ErrorResponse;
import com.hng.hng_backend_task.exceptions.Task2Exception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(Task2Exception.class)
    public ResponseEntity<Task2ErrorResponse> handleTask2Exception(Exception ex) {
        System.out.println(ex.getMessage());

        Task2ErrorResponse response = Task2ErrorResponse.builder()
                .number("alphabet")
                .error(true)
                .build();

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
