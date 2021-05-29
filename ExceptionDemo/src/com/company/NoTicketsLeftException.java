package com.company;

public class NoTicketsLeftException extends Exception {
    public NoTicketsLeftException(String message) {
        super(message);
    }
}
