package com.abhishekchoksi.movieApi.exceptions;

public class RePasswordNotMatchException extends RuntimeException{

    public RePasswordNotMatchException(String message) {
        super(message);
    }
}
