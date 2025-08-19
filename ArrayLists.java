
import java.util.ArrayList;
import java.util.Collections;


public class ArrayLists {
    public static void main(String [] args){

       ArrayList<Integer> list = new ArrayList<>();

       list.add(2);
       list.add(3);
       list.add(2);
       list.add(1);

        Collections.sort(list);

       int size = list.size();

        System.out.println(size);
        System.out.println(list);


    }
}
