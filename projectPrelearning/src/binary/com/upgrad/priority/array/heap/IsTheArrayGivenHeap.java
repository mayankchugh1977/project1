package binary.com.upgrad.priority.array.heap;

import java.util.Arrays;
import java.io.*;
import java.util.*;
import java.util.Scanner;

class IsTheArrayGivenHeap{
    public static boolean  isHeap(int[] arr,  int n){
        //Write your code here
        //Check if the array element is less than it's child element in the array,
        //and if they are less return false else return true

        for (int i = (n - 2) / 2; i > -1; --i) { // start from the first internal node who has children;
            int j = 2 * i + 1; // the left child;
            if (j < n - 1 && arr[i] < arr[j+1]) j++; // select the bigger child;
            if (arr[i] < arr[j]) return false; // if parent is smaller than the child;
        }

        return true;
    }
    public static int[] getArrayInput(int size, Scanner scanner) {
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray1 = scanner.nextInt();
        int arr[] = getArrayInput(sizeArray1, scanner);
        int n = arr.length;
        String x = isHeap(arr, n)? "Yes": "No";

        System.out.println(x);
    }

}
