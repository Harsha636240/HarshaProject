import java.util.ArrayList;
import java.util.HashSet;

public class recursion {

    public static void printpermu(String str , String newString,int idx , HashSet<String> set) {

        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }
            System.out.println(newString);
            set.add(newString);
            return;

        }

        char current = str.charAt(idx);

        printpermu(str, newString+current, idx+1,set);

        printpermu(str, newString, idx+1,set);


    }

    public static void main(String[]args){

        HashSet<String> set = new HashSet<>();

        printpermu("aaa","",0,set);

















    }
}