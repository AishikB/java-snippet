package com.company;

public class Main {

    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();
        td.start();
        RunnableDemo rd = new RunnableDemo();
        Thread t = new Thread(rd);
        t.start();
	    for (int i=0; i<100; i++) {
	        System.out.println("From main thread : "+i);
        }
    }
}
