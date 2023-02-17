
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }

    public int priceDifference(Apartment compared) {
        int price = this.princePerSquare * this.squares;
        int comparedPrice = compared.princePerSquare * compared.squares;
        return Math.abs(price - comparedPrice);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        return this.squares * this.princePerSquare > compared.squares * compared.princePerSquare;
    }

}
