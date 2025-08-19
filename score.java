import java.util.Scanner;

public class score {

    public static int N = 3;

    public static void main(String[] args) {
        int sum = 0;
    
     Scanner sc = new Scanner(System.in);
        int score [] = new int [N];
        for(int i=0;i<score.length;i++){
            System.out.println("Score:");
            score[i]=sc.nextInt();
             sum += score[i];
        }
        float a = (float)(sum / 3.0);
        System.out.println(a);


      

        

    }

}
