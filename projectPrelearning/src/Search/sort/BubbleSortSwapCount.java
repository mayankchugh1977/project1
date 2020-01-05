package Search.sort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortSwapCount {

   static int totalBubbleSortSwaps(int[] array, int M) {
        int size = array.length;
        int var = 0;
        int totalSwaps = 0;

        for (int i = 0; i < M; i++) {
            // setting the initial value of swap to zero.

            for (int j = 1; j < size - i; j++) {
                if (array[j - 1] < array[j]) {
                    //swapping when element at position j-1 is greater than element at j position.
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;

                    totalSwaps++;
                    /* if at any step the swapping is done, we change the swap value to one,
                    so that we know  that the sequence is not sorted at this step.*/
                }
            }

        }
        return totalSwaps;
    }

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int M = input.nextInt();
        int size = input.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(totalBubbleSortSwaps(arr,  M));
    }
}
