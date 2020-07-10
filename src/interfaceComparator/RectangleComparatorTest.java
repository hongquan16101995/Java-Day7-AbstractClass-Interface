package interfaceComparator;

import java.util.Arrays;

public class RectangleComparatorTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[4];
        rectangles[0] = new Rectangle(50.0,30.0);
        rectangles[1] = new Rectangle(30.0,40.0);
        rectangles[2] = new Rectangle(5.0,2.0);
        rectangles[3] = new Rectangle(100.0,20.0);

        System.out.println("Pre-sort:");
        for (Rectangle rectangle : rectangles){
            System.out.println(rectangle);
        }

        RectangleComparetor rectangleComparetor = new RectangleComparetor();
        Arrays.sort(rectangles, rectangleComparetor);

        System.out.println("After-sort:");
        for (Rectangle rectangle : rectangles){
            System.out.println(rectangle);
        }
    }
}
