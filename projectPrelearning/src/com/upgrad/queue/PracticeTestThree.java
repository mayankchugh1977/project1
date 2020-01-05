package com.upgrad.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PracticeTestThree {
        public static void func() {
            Queue<Integer> queue = new LinkedList<Integer>();
            queue = new LinkedList<Integer>();
            Stack<Integer> stack = new Stack<>();
            while (!queue.isEmpty()) {
                stack.add(queue.peek());
                queue.remove();
            }
            while (!stack.isEmpty()) {
                queue.add(stack.peek());
                stack.pop();
            }
        }

        public static void main(String arg[]) {
            Queue < Integer > q = new LinkedList< Integer >();
            q.add(0); // Inserts the element passed as parameter to the end of the queue
            q.add(1);
            for (int i = 0; i < 3; i++)
            {
                int num1 = q.remove(); // Returns and removes the element at the front of queue
                int num2 = q.remove();
                q.add(num2);
                q.add(++num2);
                System.out.println(num1);
            }
        }
    }
