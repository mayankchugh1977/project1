package binary.com.upgrad.priority.smallestRange;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueSmallestRange{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[][] = new int[k][n];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        getSmallestRange(arr, k, n);
    }

    private static void getSmallestRange(int arr[][], int k, int n) {
        PriorityQueue<HeapIndex> priorityQueue = new PriorityQueue<>(k, new Comparator<HeapIndex>() {
            @Override
            public int compare(HeapIndex o1, HeapIndex o2) {
                return o1.val.compareTo(o2.val);
            }
        });
        int min, max = Integer.MIN_VALUE, range = Integer.MAX_VALUE, start = 0, end = 0;
        for (int i = 0; i < k; i++) {
            HeapIndex heapIndex = new HeapIndex(arr[i][0], i, 0);
            priorityQueue.add(heapIndex);
            max = Math.max(arr[i][0], max);
        }

        while (true) {
            HeapIndex minHeapIndex = priorityQueue.poll();
            min = minHeapIndex.val;
            if (range > max - min + 1) {
                range = max - min + 1;
                start = min;
                end = max;
            }
            if (minHeapIndex.column < (n - 1)) {
                int nextColumn = minHeapIndex.column + 1;
                HeapIndex nextHeapIndex = new HeapIndex(arr[minHeapIndex.row][nextColumn], minHeapIndex.row, nextColumn);
                max = Math.max(nextHeapIndex.val, max);
                priorityQueue.add(nextHeapIndex);
            } else {
                break;
            }
        }
        System.out.println("Smallest range is : [" + start + ", " + end + "]");
    }

    private static class HeapIndex {
        Integer val;
        int row;
        int column;

        HeapIndex(Integer val, int row, int column) {
            this.val = val;
            this.row = row;
            this.column = column;
        }
    }
}