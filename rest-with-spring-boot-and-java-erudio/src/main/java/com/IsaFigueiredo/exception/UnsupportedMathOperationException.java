package com.IsaFigueiredo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST) // 400
public class UnsupportedMathOperationException extends RuntimeException {

    public UnsupportedMathOperationException(String message) {

        super(message);
    }
}
