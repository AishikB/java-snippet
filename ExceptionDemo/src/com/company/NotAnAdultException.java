package com.company;

public class NotAnAdultException extends Exception {

    @Override
    public String toString() {
        return "User is not an adult";
    }
}
