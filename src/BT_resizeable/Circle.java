package BT_resizeable;

import interfaceComparator.Shape;

public class Circle extends Shape implements Resizeable{

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

    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + "}";
    }

    @Override
    public void resize(long percent) {
        this.radius = this.radius*percent;
    }
}
