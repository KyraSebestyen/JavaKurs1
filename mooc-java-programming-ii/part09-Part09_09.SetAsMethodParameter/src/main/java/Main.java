import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("one");
        set.add("two");

        System.out.println(returnSize(set)); //should be 2

    }

    public static int returnSize(Set<String> set) {
        return set.size();
    }

}
