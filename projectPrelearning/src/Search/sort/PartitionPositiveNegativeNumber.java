package Search.sort;

import java.util.*;

public class PartitionPositiveNegativeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        partitionNegativeAndPositive(n, arr);
    }

    // Method to partition negative and positive numbers without comparing with 0
    static void partitionNegativeAndPositive(int n, int arr[]) {
        // Write your code here

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        // arr[0] is stored in list1
        list1.add(arr[0]);
        for (int i = 1; i < n; i++) {
            // If arr[i] and arr[0] has opposite signs store arr[i] in list2
            if ((arr[0] ^ arr[i]) < 0) {
                list2.add(arr[i]);
            }
            // If arr[i] and arr[0] has same signs store arr[i] in list1
            else {
                list1.add(arr[i]);
            }
        }
//        System.out.println(list1);
//        System.out.println(list2);
//        System.out.println();
        if(list1 != null && list1.size() > 0) {
            for (int i = 0; i < list1.size(); i++) {
                System.out.print(list1.get(i)+" ");
            }
            System.out.println();
        }
        if(list2 != null && list2.size() > 0) {
            for (int i = 0; i < list2.size(); i++) {
                System.out.print(list2.get(i)+" ");
            }
        }

   /* The code present above populates the array into two ArrayLists of positive
   and negative numbers. The code to print the lists of positive and negative
   numbers goes here */
    }
}
