
import java.util.*;

public class calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //intout
        System.out.println("Enter the First Number");
        int a = sc.nextInt();
        System.out.println("Enter the operator +, -, *, /, %");
        char operator = sc.next().charAt(0);
        System.out.println(" Enter the the Second Number");
        int b = sc.nextInt();
        
        //operation
        switch (operator) {
            case '+':
                System.out.println("sum is :" + (a + b));
                break;
            case '-':
                System.out.println("diff is :" + (a - b));
                break;
            case '*':
                System.out.println("muli is :" + (a * b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println(" invail division");
                } else {
                    System.out.println("divi is :" + (a / b));
                    break;
                }

            case '%':
                if (b == 0) {
                    System.out.println("Invalid Division");
                } else {
                    System.out.println("module is :" + (a % b));
                    break;

                }

            default:
                System.out.println("invalid input");

        }

    }

}
