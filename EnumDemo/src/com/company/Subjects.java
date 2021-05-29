package com.company;

public enum Subjects {
    CS, IT, ECE, EE;
    private Subjects() {
        System.out.println("this.name()");
    }

}
