public class OneItemBox extends Box {
    private Item item;
    @Override
    public void add(Item item) {
        if (this.item != null) {
            return;
        }
        this.item = item;
    }

    @Override
    public boolean isInBox(Item item) {
        if (this.item == null) {
            return false;
        }
        return this.item.equals(item);
    }
}
