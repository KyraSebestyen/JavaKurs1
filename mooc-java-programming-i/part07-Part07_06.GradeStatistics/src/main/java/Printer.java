public class Printer {
    public String printStars(int numberOf) {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < numberOf; i++) {
            string.append("*");
        }
        return string.toString();
    }

    public void print(String name, double number) {
        System.out.println(name + " " + number);
    }

    public void print(String string) {
        System.out.println(string);
    }
}
