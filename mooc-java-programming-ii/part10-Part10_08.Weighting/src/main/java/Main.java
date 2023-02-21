
public class Main {

    public static void main(String[] args) {
        Hold hold = new Hold(100);
        Suitcase suitcase = new Suitcase(60);

        for (int i = 0; i <= 10; i++) {
            String name = "Name " + i;
            Item item = new Item(name, i);
            suitcase.addItem(item);
        }
        hold.addSuitcase(suitcase);

        hold.printItems();
        System.out.println(suitcase.totalWeight());
    }

}
