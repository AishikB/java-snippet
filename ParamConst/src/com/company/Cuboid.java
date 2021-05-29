package com.company;

public class Cuboid extends Rectangle {
    int height;

    public Cuboid() {
        this.height=1;
    }

    public Cuboid(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }

    public int volume() {
        return this.length*this.breadth*this.height;
    }

    @Override
    protected SurfaceArea totalArea() {
        return new SurfaceArea((2*this.length*this.breadth) + (2*this.length*this.height) + (2*this.breadth*this.height));
    }
}
