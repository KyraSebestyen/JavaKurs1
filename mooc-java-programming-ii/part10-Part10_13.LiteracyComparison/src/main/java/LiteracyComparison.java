import java.util.List;

public class LiteracyComparison {

    public static void main(String[] args) {
        LiteracyReader reader = new LiteracyReader();
        List<LiteracyData> data = reader.read("literacy.csv");
        printLiteracyData(data);
    }

    public static void printLiteracyData(List<LiteracyData> data) {
        data.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
