package com.abhishekchoksi.movieApi.exceptions;

public class OtpInvalidException extends RuntimeException {

    public OtpInvalidException(String message) {
        super(message);
    }
}
