package collect.array;

import java.util.*;

public class arrayTestOne {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        int k = s.nextInt();
        search(arr, k);
    }

    // Method to search for k in an unsorted array
    static void search(int[] arr, int k) {
        // Write your code
        boolean numCheck=false;
        for (int random : arr) {
            if(random == k){
                numCheck = true;
                break;
            }
        }
        System.out.println(numCheck);
    }
}