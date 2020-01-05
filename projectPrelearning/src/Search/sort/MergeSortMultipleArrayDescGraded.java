package Search.sort;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortMultipleArrayDescGraded {

    public static int[] sort(int[] randomNumbers) {
        return mergeSort(randomNumbers, 0, randomNumbers.length - 1);
    }

    public static int[] mergeSort(int[] numbers, int first, int last) {
        if (first < last) {
            int mid = (first + last) / 2;
            mergeSort(numbers, first, mid);
            mergeSort(numbers, mid + 1, last);

            merge(numbers, first, mid, last);
        }

        return numbers;
    }

    private static int[] merge(int[] numbers, int i, int m, int j) {
        int l = i; //inital index of first subarray
        int r = m + 1; // initial index of second subarray
        int k = 0; // initial index of merged array
        int[] t = new int[numbers.length];

        while (l <= m && r <= j) {
            if (numbers[l] > numbers[r]) {
                t[k] = numbers[l];
                k++;
                l++;
            } else {
                t[k] = numbers[r];
                k++;
                r++;
            }
        }

        // Copy the remaining elements on left half , if there are any
        while (l <= m) {
            t[k] = numbers[l];
            k++;
            l++;
        }

        // Copy the remaining elements on right half , if there are any
        while (r <= j) {
            t[k] = numbers[r];
            k++;
            r++;
        }

        // Copy the remaining elements from array t back the numbers array
        l = i;
        k = 0;
        while (l <= j) {
            numbers[l] = t[k];
            l++;
            k++;
        }

        return numbers;
    }

    /// .......
    // Write the Merge function here which uses the merge sort to sort the array in decreasing order...
    /// .......

    public static int[] getArrayInput(int size, Scanner scanner) {

        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = scanner.nextInt();
        }
        int[] sortedNumbers;
        sortedNumbers = sort(randomNumbers);
//        System.out.println(Arrays.toString(sortedNumbers));
        return randomNumbers;
    }

    public static int[] mergeBothInDescendingOrder(int[] sortedArray1, int[] sortedArray2) {
        int size = sortedArray1.length+sortedArray2.length;
        int[] finalNumbers = new int[size];

        System.arraycopy( sortedArray1, 0, finalNumbers, 0, sortedArray1.length );
        System.arraycopy( sortedArray2, 0, finalNumbers, sortedArray1.length, sortedArray2.length );

        int[] sortedNumbers;
        sortedNumbers = sort(finalNumbers);
        return sortedNumbers;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray1 = scanner.nextInt();
        int sizeArray2 = scanner.nextInt();
        int sortedArray1[] = getArrayInput(sizeArray1, scanner);
        int sortedArray2[] = getArrayInput(sizeArray2, scanner);

//        System.out.println(Arrays.toString(sortedArray1));

//        System.out.println(Arrays.toString(sortedArray2));

        int descendingMerge[]=mergeBothInDescendingOrder(sortedArray1, sortedArray2);

//        System.out.println(Arrays.toString(descendingMerge));

        for (int i = 0; i < descendingMerge.length; i++) {
//            randomNumbers[i] = scanner.nextInt();

            System.out.println(descendingMerge[i]);
        }
    }
}
