package interfaceComparator;

import java.util.Arrays;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(10.0);
        circles[1] = new Circle(7.0);
        circles[2] = new Circle(9.0);

        System.out.println("Pre-sort:");
        for (Circle circle : circles){
            System.out.println(circle);
        }

        CircleComparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sort:");
        for (Circle circle : circles){
            System.out.println(circle);
        }
    }
}
