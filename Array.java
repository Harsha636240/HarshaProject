import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
       int  [] username=new int [size];

       //input
       for(int  i=0;i< size;i++){
           username[i]= sc.nextInt();
       }
       //output
        boolean ascending = true;

       for(int i=0;i< username.length-1;i++){
           if(username[i]>username[(i+1)]){
               ascending=false;
               break;
           }
       }
       if(ascending){

               System.out.println("this is in ascending odder");

       }else{
           System.out.println("this is not in ascending odder");
       }


    }
}
