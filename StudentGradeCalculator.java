import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int subjects = scanner.nextInt();

        double totalMarks = 0;
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            double marks = scanner.nextDouble();
            totalMarks += marks;
        }

        double averageMarks = totalMarks / subjects;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);

        if (averageMarks >= 90) {
            System.out.println("Grade: A+");
        } else if (averageMarks >= 80) {
            System.out.println("Grade: A");
        } else if (averageMarks >= 70) {
            System.out.println("Grade: B");
        } else if (averageMarks >= 60) {
            System.out.println("Grade: C");
        } else if (averageMarks >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        scanner.close();
    }
}
