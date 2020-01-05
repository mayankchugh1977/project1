package com.upgrad.stack;

import java.util.*;

public class StackSortRecursion {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        sort(stack);
    }

    // Method to sort the elements of the stack in ascending order
    static void sort(Stack<Integer> stack) {
        // Write your code here

        Stack<Integer> tmpStack = new Stack<Integer>();
        while(!stack.isEmpty())
        {
            // pop out the first element
            int tmp = stack.pop();

            // while temporary stack is not empty and
            // top of stack is greater than temp
            while(!tmpStack.isEmpty() && tmpStack.peek()
                    > tmp)
            {
                // pop from temporary stack and
                // push it to the input stack
                stack.push(tmpStack.pop());
            }

            // push temp in tempory of stack
            tmpStack.push(tmp);
        }

        System.out.println(tmpStack);

        Stack<Integer> finalStk = new Stack<Integer>();

        while (!tmpStack.empty())
        {
            finalStk.push(tmpStack.peek());
            tmpStack.pop();
        }
        System.out.println(finalStk);

        System.out.print("[");
        int completeStkSize = finalStk.size();
        int i = 0;
        while (!finalStk.empty())
        {
            if (i == completeStkSize - 1 ){
                System.out.print(finalStk.peek());
            }else {
                System.out.print(finalStk.peek() + ", ");
            }
            finalStk.pop();
            i++;
        }
        System.out.print("]");
    }
}