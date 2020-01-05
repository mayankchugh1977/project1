package Search.sort;

import java.util.Scanner;

public class QuickSortStringLengthAsc {

    public static void quickSort(String array[], int left, int right) {
        if (left < right) {
            int position = partition(array, left, right);
            quickSort(array, left, position - 1);
            quickSort(array, position + 1, right);
        }
    }

        public static int partitionStr(String[] ar, int start, int end) {
            String pivot = ar[end];
            int i = start;
            for (int j = start; j < end; j++) {
                if (ar[j].compareTo(pivot) <= 0) {
                    String temp1 = ar[j];
                    ar[j] = ar[i];
                    ar[i] = temp1;
                    i++;
                }
            }
            String temp2 = ar[i];
            ar[i] = ar[end];
            ar[end] = temp2;

            return i;
        }

    public static int partition(String[] ar, int start, int end) {
        int pivot = ar.length;
        int i = start;
        for (int j = start; j < end; j++) {
            if (ar[j].length() > pivot) {
                String temp1 = ar[j];
                ar[j] = ar[i];
                ar[i] = temp1;
                i++;
            }
        }
        String temp2 = ar[i];
        ar[i] = ar[end];
        ar[end] = temp2;

        return i;
    }

    static void printArray(String arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.println(arr[i]);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String[] randomNumbers = new String[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = scanner.next();
        }

        quickSort(randomNumbers, 0, randomNumbers.length - 1);
        printArray(randomNumbers);
    }
}
