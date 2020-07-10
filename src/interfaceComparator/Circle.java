package interfaceComparator;

import BT_resizeable.Resizeable;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + "}";
    }
}
