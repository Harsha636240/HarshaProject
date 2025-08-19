import java.util.*;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] number = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                number[i][j] = sc.nextInt();
            }
        }
        System.out.println("The spiral Order matrix is");
        int rowStart =0;
        int colStart =0;
        int rowEnd =n-1;
        int colEnd =m-1;
        while(rowStart<=rowEnd && colStart<=colEnd){
            for(int col=colStart;col<=colEnd;col++){
                System.out.print(number[rowStart][col]+" ");
            }
            rowStart++;

            for(int row=rowStart;row<=rowEnd;row++){
                System.out.print(number[row][colEnd]+" ");
            }
            colEnd--;
            for(int col=colEnd;col>=colStart;col--){
                System.out.print(number[rowEnd][col]+" ");
            }
            rowEnd--;
            for(int row=rowEnd;row>=rowStart;row--){
                System.out.print(number[row][colStart] +" ");
            }
            colStart++;
                }
        System.out.println();

             }

         }



