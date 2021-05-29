package com.company;

public class SingletonDemo {
    private static SingletonDemo sd = null;
    private String name = null;
    private SingletonDemo() {
    }

    public static SingletonDemo getInstance() {
        if(sd == null) {
            sd = new SingletonDemo();
        }
        return sd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
