package binary.com.upgrad.priority;


import java.util.Arrays;
import java.io.*;
import java.util.*;
import java.util.Scanner;

class HeapSort{

    public static int leftchild(int i) {
        return (2*i+1);
    }

    public static int rightchild(int i) {
        return (2*i+2);
    }

    public static void heapsort(int[] arr, int n) {
        int size = arr.length;

        //build heap
        buildHeap(arr);

        // One by one extract (Max) an element from heap and
        // replace it with the last element in the array
        for (int i=n-1; i>=0; i--) {

            //Swap first and last element
            swap(arr,0, i);

            // use heapify operation till n-1 elements
            heapify(arr, i, 0);
        }


    }

    // To heapify a subtree with node i
    private static void heapify(int[] arr, int n, int i) {
        int l = leftchild(i);
        int r = rightchild(i);

        int smallest = i;

        if (l < n && arr[l] < arr[smallest]) {
            smallest = l;
        }

        if (r < n && arr[r] < arr[smallest]) {
            smallest = r;
        }

        // If largest is not root
        if (smallest != i) {

            swap(arr,i, smallest);
            // Recursive call to  heapify the sub-tree
            heapify(arr, n, smallest);
        }

    }


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void buildHeap(int[] arr){
        int i = (arr.length) / 2 - 1;
        while (i >= 0) {
            heapify(arr, arr.length, i );
            i--;
        }
        //System.out.println(Arrays.toString(arr));
    }

    public static int[] getArrayInput(int size, Scanner scanner) {
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void main(String args[]) {
        int arrA[] = {55, 23, 19, 14, 9, 7, 10, 12};//{-17, -221, 111, 32, -12, 15, 178, 0, 111};//{9, 10, 5, 3, 1, 2, 6};

        System.out.println("Original array is: " + Arrays.toString(arrA));
        HeapSort heapSort = new HeapSort();
        heapSort.heapsort(arrA,arrA.length);

        System.out.println("Sorted array is (Heap Sort): " + Arrays.toString(arrA));

//        Scanner scanner = new Scanner(System.in);
//        int sizeArray1 = scanner.nextInt();
//        int arr[] = getArrayInput(sizeArray1, scanner);
//        int n = arr.length;
//
//        heapsort(arr,n);
//
//        System.out.println(Arrays.toString(arr));
    }
}