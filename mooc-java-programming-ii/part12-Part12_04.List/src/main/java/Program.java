
public class Program {

    public static void main(String[] args) {
        MyArrayList<String> strings = new MyArrayList<>();
        System.out.println(strings.size());
        strings.add("hello");
        MyArrayList<Integer> integers = new MyArrayList<>();

        for (int i = 0; i <= 50; i++) {
            integers.add(i);
            if (i % 10 == 0) {
                System.out.println("Current size: " + integers.size());
            }
        }

        System.out.println(strings.contains("bla"));
        System.out.println(integers.contains(3));

        integers.remove(3);
        System.out.println(integers.contains(3));

        System.out.println(strings.value(0));
        System.out.println(strings.value(56));
    }

}
