package collect.array;

import java.util.*;

public class ArrayListFour {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = s.nextInt();
        for (int i = 0; i < n; i++)
            list.add(s.nextInt());
        reverseArrayList(list);
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
    }

    // Method to reverse the ArrayList
    static void reverseArrayList(ArrayList<Integer> list) {
        Collections.reverse(list);
    }
}