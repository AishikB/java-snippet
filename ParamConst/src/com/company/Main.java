package com.company;

public class Main {

    public static void main(String[] args) {
        Cuboid c1 = new Cuboid();
        System.out.println(c1.volume());
        Cuboid c2 = new Cuboid(2,3,4);
        System.out.println(c2.volume());
        //System.out.println(c2.totalArea().totalArea);
    }
}
