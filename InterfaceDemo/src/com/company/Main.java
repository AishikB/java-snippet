package com.company;

import com.company.interfaces.Shape;
import com.company.interfaces.impl.ShapeImpl;

public class Main {

    public static void main(String[] args) {
        Shape s = new ShapeImpl();
        Shape.getShapeName();
        System.out.println(s.area());
    }
}
