package com.abhishekchoksi.movieApi.exceptions;

public class EmptyFileException extends Throwable {
    public EmptyFileException(String message) {
        super(message);
    }
}