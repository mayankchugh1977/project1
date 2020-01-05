package collect.array;

import java.util.*;

public class ThirdLargestInArrayTest1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        thirdMaxInteger(arr);
    }

    // Method to find the third maximum integer in the array
    static void thirdMaxInteger(int[] arr) {
        // Write your code here

        int temp, size;

        size = arr.length;

        /* There should be atleast three elements */
        if (size < 3)
        {
            System.out.println("The array doesn't have a third maximum element");
            return;
        }

        for(int i = 0; i<size; i++ ){
            for(int j = i+1; j<size; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        if(arr[size-3] == arr[size-2] && arr[size-2]== arr[size-1])
        {
            System.out.println("The array doesn't have a third maximum element");
            return;
        }

        System.out.println(arr[size-3]);
    }
}