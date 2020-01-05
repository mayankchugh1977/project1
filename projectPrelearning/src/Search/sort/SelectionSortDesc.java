package Search.sort;

import java.util.Scanner;

public class SelectionSortDesc {
        public static void sortdesc(int arr[])
        {
            int n = arr.length;
            for (int i = 0; i < n-1; i++)
            {
                int min = i;
                for (int j = i+1; j < n; j++)
                    if (arr[j] > arr[min])
                        min = j;

                // Swap the found minimum element with the first element of the unsorted array
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }

        static void printarr(int arr[])
        {
            int n = arr.length;
            for (int i=0; i<n; ++i)
                System.out.println(arr[i]);
          }

        public static void main(String args[])
        {
            Scanner input = new Scanner(System.in);
            int size = input.nextInt();

            int[] arr = new int[size];

            for (int i = 0; i < size; i++) {
                arr[i] = input.nextInt();
            }
            sortdesc(arr);
            printarr(arr);
        }
    }
