package com.upgrad.queue;

import java.util.*;

public class StacktoQueue {

    /*implementing queue using linked list */
    Queue < Integer > q = new LinkedList < Integer > ();

    /* Push operation of stack using queue*/
    void push(int x) {
        //write your code here
        // get previous size of queue
        int size = q.size();

        // Add current element
        q.add(x);

        // Pop (or Dequeue) all previous
        // elements and put them after current
        // element
        for (int i = 0; i < size; i++)
        {
            // this will add front element into
            // rear of queue
            int val = q.remove();
            q.add(val);
        }
    }

    /*Removes the top element of the stack*/

    int pop() {
        //write your code here
        if (q.isEmpty())
        {
            System.out.println("Stack is empty");
            System.exit(0);
        }
        int x = q.remove();
        return x;
    }


    /*Returns the element at the top of the stack */
    int top() {
        //write your code here
        if (q.isEmpty())
        {
            System.out.println("Stack is empty");
            System.exit(0);
        }
        return q.peek();
    }


    public static void main(String[] args) {
        StacktoQueue obj = new StacktoQueue();
        Scanner in = new Scanner(System.in);

        /*Enter the number of elements you want to add in the stack */

        int n = in .nextInt();

        /*Enter the elements of the stack */
        for (int i = 0; i < n; i++) {
            obj.push( in .nextInt());
        }

        System.out.println(obj.top());
        obj.pop();
        System.out.println(obj.top());
    }
}