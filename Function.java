
import java.util.*;

public class Function {

  static void primeNum(int n){
boolean isprime = true;
      for ( int i = 2 ; i <= n / 2 ; i ++) {
          if (n % i == 0){
              isprime = false;
              break;
          }

      }

      if(isprime){
          if(n==1){
              System.out.println("1 is neither prime not composite");
          }else {
              System.out.println("This is a prime number ");
          }
      }else {
          System.out.println("This is not a prime number");
      }
  }

    public static void main(String[] args) {
      Scanner sc  = new Scanner(System.in);
      int a = sc.nextInt();

     primeNum(a);


    }
}
