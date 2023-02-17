
public class MainProgram {

    public static void main(String[] args) {
        Money a = new Money(10, 50);
        Money b = new Money(3, 70);

        Money c = a.minus(b);

        System.out.println(c);

    }
}
