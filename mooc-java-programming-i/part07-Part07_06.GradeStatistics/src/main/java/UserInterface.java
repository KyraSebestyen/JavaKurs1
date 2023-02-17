import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Statistics statistics = new Statistics();
    private Exam exam;
    private Printer printer = new Printer();

    public UserInterface(Scanner scanner, Exam exam) {
        this.scanner = scanner;
        this.exam = exam;
    }

    public void start() {
        GradePoints points = new GradePoints();
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.parseInt(this.scanner.nextLine());
            if (input == -1) {
                break;
            }
            points.addGrade(input);
        }
        GradePoints grades = new GradePoints();
        for (Integer point : points.getGrades()) {
            if (exam.numberInInterval(point)) {
                this.statistics.increaseCount();
                this.statistics.increaseSum(point);
                int grade = exam.convertPointsToGrade(point);
                grades.addGrade(grade);

                if (exam.passing(point)) {
                    this.statistics.increaseCountOfPassing();
                    this.statistics.increaseSumOfPassing(point);
                }
            }

        }
        double average = this.statistics.average();
        double averagePassing = this.statistics.averagePassing();
        double passPercentage = this.statistics.passPercentage();
        System.out.println("Point average (all): " + average);
        if (averagePassing == -1.0) {
            printer.print("Point average (passing): -");
        } else {
            printer.print("Point average (passing):", averagePassing);
        }
        printer.print("Pass percentage:", passPercentage);
        printer.print("Grade distribution:");
        grades.printGradeDistribution();
    }
}
