import java.util.Scanner;

public class banking {


    static Scanner sc = new Scanner(System.in);


    public static void showBalance (double balance ){
        System.out.println("_________________");
        System.out.println("₹"+String.format("%.2f",balance));
    }

    
    public static int deposit (){
        System.out.println("ENTER THE AMOUNT TO BE DEPOSITED: ");
        int amount = sc.nextInt();
        if(amount<=0){
            System.out.println("Amount can't be negetive or zero");
            return 0;
        }
        else {
            return amount;
        }

    }

    public static int withdraw (double balance) {
        System.out.println("ENTER THE AMOUNT TO BE WITHDRAW");
        int amount = sc.nextInt();
        if (amount > balance) {
            System.out.println("Inefficient balance ");
            return 0;
        } else if (amount <= 0) {
            System.out.println("Amount can't be negetive or zero");
            return 0;
        }else {
            return amount;
        }

    }
    public static void main(String []args){


        double balance  =  0;
        boolean isRunning = true;


        while (isRunning) {

            System.out.println("_________________");
            System.out.println(" BANKING PROGRAM ");
            System.out.println("_________________");
            System.out.println("1. Show Balance ");
            System.out.println("2. Deposit ");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("_________________");
            System.out.println("Enter your choice 1--4");
             int choice = sc.nextInt();

             switch (choice){
                 case 1 -> showBalance(balance);
                 case 2 -> balance +=deposit();
                 case 3 -> balance -= withdraw(balance);
                 case 4 -> isRunning = false;
                 default -> System.out.println("INVALID CHOICE");
             }



        }
        System.out.println("_________________________");
        System.out.println("Thank you! Have nice day!");
        System.out.println("_________________________");
    }

}
