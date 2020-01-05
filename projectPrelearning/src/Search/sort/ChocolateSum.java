package Search.sort;

import java.util.Arrays;
import java.util.Scanner;

public class ChocolateSum {


    /* arr is an array indicating the chocolate, n is the size of ‘arr’,
 'd' indicates the date of Rahul’s birthday and 'm' indicates the
month of Rahul’s birthday. */


    static int numberOfSubarrays(int[] arr, int n, int d, int m){

        int total = 0;
        int count = 0;
        int limitCheck = 0;
        int countWay = 0;

        /* Write your code here */
        if(n>4) {
            for (int i = 0; i < n; i++) {

                count++;

                if( count == 1 ){
                    if( i > 0 ){
                        limitCheck = n - i + (m - 1);
                    }else {
                        limitCheck = n - i;
                    }
                    if (limitCheck < m){
                        break;
                    }
                }


                total = total + arr [i];

                if(count == m){
                    if(total == d){
                        countWay ++;
                    }
                    count = 3;
                    total = total - arr [i - (m - 1)];
                }

            }
        }
        return countWay;
    }

    public static void main(String[] args)
    {
//        int[] a = { 1, 4, 3, 5, 6, 4 };

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }
        int d = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println(numberOfSubarrays(a, a.length, 18, 4));

    }
}
