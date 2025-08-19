
import java.util.*;

class looptest{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int n = sc.nextInt();
        boolean isprime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isprime = false;
                break;
            }
        }
        if (isprime) {
            if (n == 1) {
                System.out.println("1 is neither prime nor composite");
            } else {
                System.out.println("is a prime number");
            }
        } else {
            System.out.println("is not a prime number");
        }

    }
}
