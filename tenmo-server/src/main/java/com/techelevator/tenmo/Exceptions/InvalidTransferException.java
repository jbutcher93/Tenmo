package com.techelevator.tenmo.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class InvalidTransferException extends RuntimeException {

    public InvalidTransferException(String message) {
        super(message);
    }

}
