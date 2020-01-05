package binary.com.upgrad.hash;

import java.util.HashMap;
import java.util.Scanner;

class SymmetricPairsCheck {

    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);

        //number of pairs in the array
        int n = in.nextInt();
        int arr[][] = new int[n][2];

        // store the input pairs to an array "arr"
        for (int i = 0; i < n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        // Write your code here
        //Create a empty HashMap
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        boolean flag = false;

        //Travers through the given array "arr"
        for (int i = 0; i < arr.length; i++) {
            //First element of the current pair
            int first1 = arr[i][0];
            //Second element of the current pair
            int second1 = arr[i][1];

            //Check if the second element present in the hashmap or not
            Integer data = hashMap.get(second1);

            //If present and the firstC element of the current pair and value of the key in hashmap
            if (data != null && data == first1) {
                System.out.println(second1 + " " + first1);
                flag = true;
            }
            /* Otherise, add that current pair to the hashmap considering the firstC element
            pair as the key and the second element of the pair as the value of the key in the hashmap
             */
            else
                hashMap.put(first1, second1);
        }

        if (!flag){
            System.out.println("No Symmetric pair");
        }


    }
}
