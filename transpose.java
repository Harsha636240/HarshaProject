import java.util.*;
public class transpose {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        int [][]number=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                number[i][j]=sc.nextInt();
            }

        }
        System.out.println("The transpose is:");

        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                System.out.print(number[i][j]+" ");

            }
            System.out.println();
        }


    }
}
