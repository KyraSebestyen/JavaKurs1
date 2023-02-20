
public class Main {

    public static void main(String[] args) {
        Box box = new Box(10);
        Box smallBox = new Box(1);

        smallBox.add(new CD("Lady Gaga", "Born this way", 2011));
        smallBox.add(new Book("Stephen King", "Duma Key", 0.7));

        box.add(smallBox);

        System.out.println(smallBox);
        System.out.println(box);
    }

}
