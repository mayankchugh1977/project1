package Search.sort;

import java.util.Scanner;

public class Quadruple {



    /* arr is an array indicating the chocolate, n is the size of ‘arr’,
 'd' indicates the date of Rahul’s birthday and 'm' indicates the
month of Rahul’s birthday. */


    static int maxProdQuad(int n, int[] arr){

        int total = 0;
        int OldMulti = 0;
        int count = 0;
        int limitCheck = 0;
        int countWay = 0;

        /* Write your code here */
        if(n>4) {
            for (int i = 0; i < n; i++) {

                count++;

                if( count == 1 ){
                    if( i > 0 ){
                        limitCheck = n - i + 3;
                    }else {
                        limitCheck = n - i;
                    }
                    if (limitCheck < 4){
                        break;
                    }
                }

                total = 1;
                total = total * Math.abs(arr [i]);

                if(count == 4){
                    if(total > OldMulti){
                        OldMulti = total;
                    }
                    count = 3;
                }

            }
        }

        if(total > OldMulti){
            OldMulti = total;
        }
        return total;
    }

    public static void main(String[] args)
    {
//        int[] a = { 1, 4, 3, 5, 6, 4 };

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(maxProdQuad( n, arr));
//        System.out.println(numberOfSubarrays(a, a.length, 18, 4));

    }
}
