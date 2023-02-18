
import java.util.HashMap;
import java.util.Map;

public class Nicknames {
    public static void main(String[] args) {
        // Do the operations required here!
        Map<String, String> namesAndNicknames = new HashMap<>();
        namesAndNicknames.put("matthew", "matt");
        namesAndNicknames.put("michael", "mix");
        namesAndNicknames.put("arthur", "artie");

        System.out.println(namesAndNicknames.get("matthew"));
    }

}
