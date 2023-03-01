import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        /*MagicSquare square = new MagicSquare(3);
        square.placeValue(0,0,1);
        square.placeValue(1,0,1);
        square.placeValue(2,0,1);
        square.placeValue(0,1,2);
        square.placeValue(2,1,2);
        square.placeValue(1,1,2);
        square.placeValue(0,2,3);
        square.placeValue(2,2,3);
        square.placeValue(1,2,3);
        ArrayList<Integer> rowSums = square.sumsOfRows();
        System.out.println("Row sums");
        rowSums.forEach(System.out::println);

        ArrayList<Integer> colSums = square.sumsOfColumns();
        System.out.println("Column sums");
        colSums.forEach(System.out::println);

        ArrayList<Integer> diagonalSums = square.sumsOfDiagonals();
        System.out.println("Diagonal sums");
        diagonalSums.forEach(System.out::println);*/

       MagicSquareFactory msFactory = new MagicSquareFactory();
       System.out.println(msFactory.createMagicSquare(5));
    }
}
