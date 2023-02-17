
public class Main {

    public static void main(String[] args) {
        Gift chocolate = new Gift("Chocolate", 1);
        Gift book = new Gift("Book", 3);

        Package santasPackage = new Package();
        santasPackage.addGift(chocolate);

        System.out.println(santasPackage.totalWeight());

        santasPackage.addGift(book);

        System.out.println(santasPackage.totalWeight());

    }
}
