package interfaceComparator;

import BT_colorable.Colorable;

public class Square extends Shape implements Colorable {

    private double size;

    public double getSize() {
        return size;
    }

    public Square(double size) {
        this.size = size;
    }

    @Override
    public double getArea() {
        return this.size*this.size;
    }

    @Override
    public String howToColor() {
        return "Color all four sides";
    }

    @Override
    public String toString() {
        return "Square{" + "size=" + size + "}";
    }
}
