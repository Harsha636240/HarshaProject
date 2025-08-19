import java.util.ArrayList;

public class Backtracking {
    public static ArrayList<Integer> createAndReturnList() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        return numbers;
    }

    public static void main(String[] args) {
        ArrayList<Integer> receivedList = createAndReturnList();
        System.out.println("Returned ArrayList: " + receivedList);
    }
}