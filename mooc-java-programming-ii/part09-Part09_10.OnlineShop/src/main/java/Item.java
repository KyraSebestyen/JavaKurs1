public class Item {
    private String name;
    private int quantity;
    private int unitPrice;
    public Item(String product, int qty, int unitPrice) {
        this.name = product;
        this.quantity = qty;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return unitPrice * quantity;
    }

    public void increaseQuantity() {
        this.quantity++;
    }

    @Override
    public String toString() {
        return name + ": " + quantity;
    }
}
