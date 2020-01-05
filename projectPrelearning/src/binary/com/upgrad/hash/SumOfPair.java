package binary.com.upgrad.hash;

import java.util.Arrays;
import java.util.Scanner;

class SumOfPair
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);

        // number of the elements
        int n = in.nextInt();

        int array[] = new int[n];

        //storing the input integers to an array
        for(int i =0;i<n;i++){
            array[i] = in.nextInt();
        }

        // getting the target sum from input
        int targetSum = in.nextInt();

        //write your code here

        int l, r;
        String checkYn = "false";
        /* Sort the elements */
        Arrays.sort(array);
        int arr_size = array.length;
        /* Now look for the two candidates
        in the sorted array*/
        l = 0;
        r = arr_size - 1;
        while (l < r) {
            if (array[l] + array[r] == targetSum) {
                checkYn = "true";
                break;
            } else if (array[l] + array[r] < targetSum) {
                l++;
            }else { // A[i] + A[j] > sum
                r--;
            }
        }

        System.out.println(checkYn);
    }
}
