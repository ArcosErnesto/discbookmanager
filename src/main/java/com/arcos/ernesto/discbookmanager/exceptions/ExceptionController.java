package com.arcos.ernesto.discbookmanager.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(DiscGenreAlreadyExistsException.class)
    public ResponseEntity<ExceptionDetails> PlayerAlreadyExistsException(DiscGenreAlreadyExistsException exception) {
        ExceptionDetails details = new ExceptionDetails(exception.getMessage(), HttpStatus.BAD_REQUEST.value());
        return new ResponseEntity<>(details, HttpStatus.BAD_REQUEST);
    }

}
