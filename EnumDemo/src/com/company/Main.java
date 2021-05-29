package com.company;

public class Main {

    public static void main(String[] args) {
	    Department d = Department.CS;
	    System.out.println(d.getLocation());
	    d.setLocation("Block D");
        System.out.println(d.getLocation());

        Subjects s = Subjects.CS;
        System.out.println(s.name());
    }
}
