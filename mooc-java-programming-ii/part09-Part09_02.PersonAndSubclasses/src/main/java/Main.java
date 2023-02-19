import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Person kyra = new Person("Kyra", "WMS 6");
        System.out.println(kyra);

        Student chibi = new Student("Chibi", "Gohlis");
        System.out.println(chibi);
        chibi.study();
        System.out.println(chibi);

        Teacher strobi = new Teacher("Strobi", "JRB", 900);
        System.out.println(strobi);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(kyra);
        persons.add(chibi);
        persons.add(strobi);

        printPersons(persons);
    }

    public static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

}
