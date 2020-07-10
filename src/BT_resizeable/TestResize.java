package BT_resizeable;

import interfaceComparator.Shape;

public class TestResize {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(5.0);
        shape[1] = new Rectangle(5.0,10.0);
        shape[2] = new Square(7.0);

        System.out.println("Pre-sort:");
        for (Shape shape1 : shape){
            System.out.println(shape1.getArea());
        }


        System.out.println("After-sort:");
        for (Shape shape2 : shape){
            if(shape2 instanceof Square || shape2 instanceof Circle || shape2 instanceof Rectangle){
                ((Resizeable) shape2).resize(Math.round(Math.random()*50));
            }
            System.out.println(shape2.getArea());
        }
    }
}
