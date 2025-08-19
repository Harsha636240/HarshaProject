import java.util.Scanner;

public class Main  {
    public static  void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your DOB: ");
        int year = sc.nextInt();
        int currentYear  = 2025;
        int age = currentYear - year;

        if(age>=60){
            System.out.println(name);
            System.out.println("The person is senior citizen");
        }else {
            System.out.println(name);
            System.out.println("The person is not senior citizen");
        }






    }
}

