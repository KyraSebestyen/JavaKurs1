import java.util.ArrayList;

public class GradePoints {
    private ArrayList<Integer> grades = new ArrayList<>();
    private Printer printer = new Printer();

    public void addGrade(int grade) {
        if (grade != -1) {
            this.grades.add(grade);
        }
    }

    public void printGradeDistribution() {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        for (Integer grade : this.grades) {
            if (grade == 0) {
                count0++;
            }
            if (grade == 1) {
                count1++;
            }
            if (grade == 2) {
                count2++;
            }
            if (grade == 3) {
                count3++;
            }
            if (grade == 4) {
                count4++;
            }
            if (grade == 5) {
                count5++;
            }
        }
        System.out.println("5: " + printer.printStars(count5));
        System.out.println("4: " + printer.printStars(count4));
        System.out.println("3: " + printer.printStars(count3));
        System.out.println("2: " + printer.printStars(count2));
        System.out.println("1: " + printer.printStars(count1));
        System.out.println("0: " + printer.printStars(count0));
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }
}
