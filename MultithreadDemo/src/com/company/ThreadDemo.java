package com.company;

public class ThreadDemo extends Thread {
    @Override
    public void run() {
        for(int i=0; i<100; i++) {
            System.out.println("From thread : " + i);
        }
    }
}
