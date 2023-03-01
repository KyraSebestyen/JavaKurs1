public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {
        MagicSquare square = new MagicSquare(size);

        Coordinate coordinate = new Coordinate(0, size / 2);

        for (int i = 1; i <= size * size; i++) {
            square.placeValue(coordinate.row, coordinate.column, i);
            coordinate = getNextCoordinate(coordinate, square);
        }
        return square;
    }

    private static Coordinate getNextCoordinate(Coordinate currentCoordinate, MagicSquare square) {
        Coordinate upperRight = new Coordinate((square.getHeight() + currentCoordinate.row - 1) % square.getHeight(), (currentCoordinate.column + 1) % square.getWidth());
        if (square.readValue(upperRight.row, upperRight.column) > 0) {
            return new Coordinate((currentCoordinate.row + 1) % square.getHeight(), currentCoordinate.column);
        }

        return upperRight;
    }


    public static class Coordinate {
        int row;
        int column;

        public Coordinate(int row, int column) {
            this.row = row;
            this.column = column;
        }
    }
}
