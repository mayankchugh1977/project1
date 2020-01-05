package com.upgrad.queue;

import java.util.*;

    public class GradedQuestionLast {
        public static void main(String args[]) {
            Queue<Integer> queue = new LinkedList<Integer>();
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            while (n-- > 0)
                queue.add(s.nextInt());
            sort(queue);
        }

        // Method to sort the queue
        static void sort(Queue<Integer> queue) {
            // Write your code here

            Stack<Integer> tmpStack = new Stack<Integer>();
            while(!queue.isEmpty())
            {
                // pop out the first element
                int tmp = queue.remove();

                // while temporary stack is not empty and
                // top of stack is greater than temp
                while(!tmpStack.isEmpty() && tmpStack.peek()
                        > tmp)
                {
                    // pop from temporary stack and
                    // push it to the input stack
                    queue.add(tmpStack.pop());
                }

                // push temp in tempory of stack
                tmpStack.push(tmp);
            }

            System.out.println(tmpStack);
        }
    }