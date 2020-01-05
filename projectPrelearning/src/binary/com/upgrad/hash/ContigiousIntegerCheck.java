package binary.com.upgrad.hash;

import java.util.*;

    class ContigiousIntegerCheck {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n;
            n = in.nextInt();

            //array to store the input elements
            int[] array = new int[n];

            //storing the elements to the array
            for (int i = 0; i < n; i++) {
                array[i] = in.nextInt();
            }

            // Write your code here
            String contigiusArrYn = "false";
            // Sort the array
            Arrays.sort(array);

            // After sorting, check if
            // current element is either
            // same as previous or is
            // one more.
            for (int i = 1; i < n; i++) {
                if (array[i] - array[i - 1] > 1) {
                    contigiusArrYn = "false";
                    break;
                } else {
                    contigiusArrYn = "true";
                }
            }
            System.out.println(contigiusArrYn);
        }
    }
