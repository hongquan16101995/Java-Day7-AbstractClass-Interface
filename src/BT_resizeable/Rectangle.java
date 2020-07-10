package BT_resizeable;

import interfaceComparator.Shape;

public class Rectangle extends Shape implements Resizeable{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return this.height*this.width;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

    @Override
    public void resize(long percent) {
        this.width = this.width*percent;
        this.height = this.height*percent;
    }
}

