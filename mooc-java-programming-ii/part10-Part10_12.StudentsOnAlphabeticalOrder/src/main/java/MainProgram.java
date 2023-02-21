import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainProgram {

    public static void main(String[] args) {
        Student first = new Student("jamo");
        Student second = new Student("jamo1");
        System.out.println(first.compareTo(second));
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kim"));
        students.add(new Student(("Chris")));
        students.add(new Student("Leonard"));
        students.add(new Student("Kyra"));
        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);
    }
}
