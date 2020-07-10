package BT_resizeable;

import interfaceComparator.Shape;

public class Square extends Shape implements Resizeable{

    private double size;

    public double getSize() {
        return size;
    }

    public Square(double size) {
        this.size = size;
    }

    public double getArea(){
        return this.size*this.size;
    }

    @Override
    public String toString() {
        return "Square{" + "size=" + size + "}";
    }

    @Override
    public void resize(long percent) {
        this.size = this.size*percent;
    }
}
