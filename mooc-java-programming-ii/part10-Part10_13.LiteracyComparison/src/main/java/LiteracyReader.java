import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LiteracyReader {
    public List<LiteracyData> read(String file) {
        List<LiteracyData> data = new ArrayList<>();
        try {
            Files.lines(Paths.get(file))
                    .map(line -> line.split(","))
                    .filter(parts -> parts.length == 6)
                    .map(parts -> new LiteracyData(parts[2], parts[3], Integer.parseInt(parts[4]), Double.parseDouble(parts[5])))
                    .forEach(data::add);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return data;
    }
}
