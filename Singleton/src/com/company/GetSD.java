package com.company;

public class GetSD {
    public void getSDDetails() {
        SingletonDemo sd = SingletonDemo.getInstance();
        System.out.println(sd.getName());
    }
}
