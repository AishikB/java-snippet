package com.company;

public class RunnableDemo implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<100; i++) {
            System.out.println("From Runnable Thread : " + i);
        }
    }
}
