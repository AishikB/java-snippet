package com.company;

public class Rectangle {
    int length;
    int breadth;

    public Rectangle() {
        this.length = this.breadth = 1;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

     Area totalArea() {
        return new Area(length*breadth);
    }
}
