import java.util.Scanner;

public class StudentPassFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] grades = new int[3];
        int failedSubjects = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the grade for subject " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
            if (grades[i] <= 40) {
                failedSubjects++;
            }
        }

        if (failedSubjects == 0) {
            System.out.println("The student has passed.");
        } else {
            System.out.println("The student has failed in " + failedSubjects + " subject(s).");
        }

        scanner.close();
    }
}
