package me.dio.controller.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class GlobalExceptionRandler {

    private final Logger logger = LoggerFactory.getLogger(GlobalExceptionRandler.class);

    @ExceptionHandler(IllegalAccessException.class)
    public ResponseEntity<String> handlebusinessException(IllegalArgumentException businessException) {
    return new ResponseEntity<>(businessException.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> rendlenotFoundException(NoSuchElementException notFoundException) {
        return new ResponseEntity<>("Resource ID not foun.", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> handleUnexpectedExeption(Throwable unexpectedExeption) {
        var message = "Unexpected sever error, see the logs.";
        logger.error(message, unexpectedExeption);
        return new ResponseEntity<>(message, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
}
