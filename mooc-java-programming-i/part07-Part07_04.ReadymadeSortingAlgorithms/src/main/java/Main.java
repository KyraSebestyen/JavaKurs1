import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        /* int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
        System.out.println(Arrays.toString(array));
         */
        ArrayList<String> strings = new ArrayList<>();
        strings.add("will");
        strings.add("this");
        strings.add("print");
        strings.add("in");
        strings.add("alphabetical");
        strings.add("order");
        strings.add("?");

        for(String string : strings) {
            System.out.print(string + " ");
        }

        sortStrings(strings);
        System.out.println();

        for(String string : strings) {
            System.out.print(string + " ");
        }
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }
    public static void sort(String[] array) {
        Arrays.sort(array);
    }
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }

}
