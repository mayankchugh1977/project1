package com.upgrad.queue;

import java.util.*;

public class Delete2ndHalf {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
        deleteSecondHalf(queue);
    }

    // Method to delete the second half of the elements and print the remaining elements
    static void deleteSecondHalf(Queue<Integer> queue) {
        // Write your code here
        Queue<Integer> queue2nd = new LinkedList<Integer>();

        int n = queue.size()/2 + queue.size()%2;
       for (int i = 0 ; i < n ; i++){
            queue2nd.add(queue.peek());
            queue.remove();
       }

       System.out.println(queue2nd);
    }
}