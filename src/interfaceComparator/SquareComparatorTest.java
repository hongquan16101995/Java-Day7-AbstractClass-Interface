package interfaceComparator;

import java.util.Arrays;

public class SquareComparatorTest {
    public static void main(String[] args) {
        Square[] square = new Square[4];
        square[0] = new Square(36.0);
        square[1] = new Square(10.0);
        square[2] = new Square(8.0);
        square[3] = new Square(20.0);

        System.out.println("Pre-sort:");
        for (Square squares : square){
            System.out.println(squares);
        }

        SquareComparator squareComparator = new SquareComparator();
        Arrays.sort(square, squareComparator);

        System.out.println("After-sort:");
        for (Square square1 : square){
            System.out.println(square1);
        }
    }
}
