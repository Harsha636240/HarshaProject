
import java.util.*;

public class markscard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of KANNADA: ");
        int marks1 = sc.nextInt();
        if (marks1 > 100) {
            System.out.println("Invalid Number");
            return;
        }
        System.out.println("Enter the marks of ENGLISH: ");
        int marks2 = sc.nextInt();
        if (marks2 > 100) {
            System.out.println("Invalid Number");
            return;
        }
        System.out.println("Enter the marks of PHYSICS: ");
        int marks3 = sc.nextInt();
        if (marks3 > 100) {
            System.out.println("Invalid Number");
            return;
        }
        System.out.println("Enter the marks of CHEMISTRY: ");
        int marks4 = sc.nextInt();
        if (marks4 > 100) {
            System.out.println("Invalid Number");
            return;
        }
        System.out.println("Enter the marks of MATHEMATICS: ");
        int marks5 = sc.nextInt();
        if (marks5 > 100) {
            System.out.println("Invalid Number");
            return;
        }
        System.out.println("Enter the marks of BIOLOGY: ");
        int marks6 = sc.nextInt();
        if (marks6 > 100) {
            System.out.println("Invalid Number");
            return;
        }

        int total = marks1 + marks2 + marks3 + marks4 + marks5 + marks6;
        float percentage = (total / 600.0f) * 100;
        System.out.println("Subject 1: " + "KANNADA" + "--- Marks: " + marks1);
        System.out.println("Subject 2: " + "ENGLISH" + "--- Marks: " + marks2);
        System.out.println("Subject 3: " + "PHYSICS" + "--- Marks: " + marks3);
        System.out.println("Subject 4: " + "CHEMISTRY" + "--- Marks: " + marks4);
        System.out.println("Subject 5: " + "MATHEMATICS" + "--- Marks: " + marks5);
        System.out.println("Subject 6: " + "BIOLOGY" + "--- Marks: " + marks6);
        System.out.println("Total marks: " + total);
        //Calculate percentage
        System.out.println("Percentage: " + percentage + "%");
        //pass or fail
        if (percentage >= 35) {
            System.out.println("Result : PASS");
        } else {
            System.out.println("Result : FAIL");
        }

        //Calculate total
    }
}
