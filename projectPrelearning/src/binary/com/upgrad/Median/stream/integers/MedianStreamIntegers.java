package binary.com.upgrad.Median.stream.integers;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MedianStreamIntegers {


    public static void main(String args[]) {

        MedianStreamIntegers obj = new MedianStreamIntegers();

        Scanner in = new Scanner(System.in);
        int array[]= new int[100];
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            array[i] = in.nextInt();
        }
        //write your code here

        double med = array[0];

        // max heap to store the smaller half elements
        PriorityQueue<Integer> smaller = new PriorityQueue<>
                (Collections.reverseOrder());

        // min heap to store the greater half elements
        PriorityQueue<Integer> greater = new PriorityQueue<>();

        smaller.add(array[0]);
        System.out.println(med);

        // reading elements of stream one by one
        /* At any time we try to make heaps balanced and
            their sizes differ by at-most 1. If heaps are
            balanced,then we declare median as average of
            min_heap_right.top() and max_heap_left.top()
            If heaps are unbalanced,then median is defined
            as the top element of heap of larger size */
        for(int i = 1; i < array.length; i++)
        {

            int x = array[i];
            if(x > 0) {
                // case1(left side heap has more elements)
                if (smaller.size() > greater.size()) {
                    if (x < med) {
                        greater.add(smaller.remove());
                        smaller.add(x);
                    } else
                        greater.add(x);
                    med = (double) (smaller.peek() + greater.peek()) / 2;
                }

                // case2(both heaps are balanced)
                else if (smaller.size() == greater.size()) {
                    if (x < med) {
                        smaller.add(x);
                        med = (double) smaller.peek();
                    } else {
                        greater.add(x);
                        med = (double) greater.peek();
                    }
                }

                // case3(right side heap has more elements)
                else {
                    if (x > med) {
                        smaller.add(greater.remove());
                        greater.add(x);
                    } else
                        smaller.add(x);
                    med = (double) (smaller.peek() + greater.peek()) / 2;

                }
                System.out.println(med);
            }
        }

    }
}

