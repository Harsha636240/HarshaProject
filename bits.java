import java.util.*;

public class bits {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in );


        System.out.print("Enter the number (n): ");
        int n = sc.nextInt();

        System.out.print("Enter the position to toggle (0-based index): ");
        int pos = sc.nextInt();

        // Toggle the bit at position 'pos'
        int bitMask = 1 << pos;
        int result = n ^ bitMask;

        System.out.println("Original number in binary: " + Integer.toBinaryString(n));
        System.out.println("Toggled number in binary: " + Integer.toBinaryString(result));
        System.out.println("Toggled number (decimal): " + result);
            }
        }



