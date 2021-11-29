package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler{
     
     @ExceptionHandler(value = NullPointerException.class)
     public ResponseEntity<ApiError> handleNullPointerException(NullPointerException e)
     {
           ApiError error = new ApiError();
           error.setException("Null pointer exception: " + e.getMessage());
           HttpStatus status = HttpStatus.NOT_ACCEPTABLE;
           return new ResponseEntity<ApiError>(error, status);
     }

     @ExceptionHandler(value = Exception.class)
     public ResponseEntity<ApiError> handleNullPointerException(Exception e)
     {
           ApiError error = new ApiError();
           error.setException("Exception: " + e.getMessage());
           HttpStatus status = HttpStatus.BAD_REQUEST;
           return new ResponseEntity<ApiError>(error, status);
     }
}