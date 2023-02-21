

public class MainProgram {

    public static void main(String[] args) {
        Checker checker = new Checker();

        System.out.println(checker.isDayOfWeek("mon")); // true
        System.out.println(checker.isDayOfWeek("MON")); // false

        System.out.println(checker.allVowels("ioaoi")); // true
        System.out.println(checker.allVowels("nope")); // false

        System.out.println(checker.timeOfDay("12:00:59")); // true
        System.out.println(checker.timeOfDay("nope")); // false
        System.out.println(checker.timeOfDay("kk:ll:mn")); // false
        System.out.println(checker.timeOfDay("59:09:23")); // false


    }
}
