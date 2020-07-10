package BT_colorable;

import interfaceComparator.Circle;
import interfaceComparator.Rectangle;
import interfaceComparator.Shape;
import interfaceComparator.Square;

public class TestColorable {
    public static void main(String[] args) {
        Shape[] shape = new Shape[4];
        shape[0] = new Circle(5.0);
        shape[1] = new Rectangle(5.0, 10.0);
        shape[2] = new Square(6.0);
        shape[3] = new Circle(7.0);

        for (Shape shape1 : shape){
            System.out.println(shape1.getArea());
            if(shape1 instanceof Square ){
                System.out.println(((Square) shape1).howToColor());
            }
        }
    }
}
