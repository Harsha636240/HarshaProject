import java.util.*;

public class scgpa {
    // Convert marks to grade points
    public static int getGradePoint(int marks) {
        if (marks >= 90 && marks <= 100) return 10;
        else if (marks >= 80) return 9;
        else if (marks >= 70) return 8;
        else if (marks >= 60) return 7;
        else if (marks >= 55) return 6;
        else if (marks >= 50) return 5;
        else if (marks >= 45) return 5;
        else if (marks >= 40) return 4;
        else if (marks >= 35) return 4;
        else if (marks >= 30) return 3;
        else if (marks >= 15) return 2;
        else if (marks >= 10) return 1;
        else if (marks >= 0) return 1;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Each subject's credit
        int[] credits = {4, 4, 3, 3, 3, 1, 1, 1}; // total = 20
        int[] marks = new int[8];
        int totalGradePoints = 0;
        int totalCredits = 0;

        System.out.println("Enter marks for 8 subjects:");

        for (int i = 0; i <= 8; i++) {
            marks[i] = sc.nextInt();
            int gradePoint = getGradePoint(marks[i]);

            if (gradePoint == -1) {
                System.out.println("Invalid input: marks must be between 0 and 100.");
                return;
            }

            totalGradePoints += gradePoint * credits[i];
            totalCredits += credits[i];
        }

        double scgpa = (double) totalGradePoints / totalCredits;

        System.out.println("Total Weighted Grade Points: " + totalGradePoints);
        System.out.println("Total Credits: " + totalCredits);
        System.out.println("SCGPA: " + scgpa);
    }
}

