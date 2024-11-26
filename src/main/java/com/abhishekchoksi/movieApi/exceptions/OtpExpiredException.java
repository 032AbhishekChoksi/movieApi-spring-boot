package com.abhishekchoksi.movieApi.exceptions;

public class OtpExpiredException extends RuntimeException {

    public OtpExpiredException(String message) {
        super(message);
    }
}
