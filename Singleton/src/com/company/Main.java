package com.company;

public class Main {

    public static void main(String[] args) {
	    SingletonDemo sd = SingletonDemo.getInstance();
	    sd.setName("Aishik");
	    GetSD gsd = new GetSD();
	    gsd.getSDDetails();
    }
}
