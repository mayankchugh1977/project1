package com.upgrad.queue;


import java.util.*;

public class PrintKtheElement {
    // This function returns the sorted stack
    public static Stack < Integer > sortStack(Stack < Integer > input) {
        //write your code here
        Stack<Integer> tmpStack = new Stack<Integer>();
        while(!input.isEmpty())
        {
            // pop out the first element
            int tmp = input.pop();

            // while temporary stack is not empty and
            // top of stack is greater than temp
            while(!tmpStack.isEmpty() && tmpStack.peek()
                    > tmp)
            {
                // pop from temporary stack and
                // push it to the input stack
                input.push(tmpStack.pop());
            }

            // push temp in tempory of stack
            tmpStack.push(tmp);
        }
        return tmpStack;
    }

    public static void findKthLargestNumMine(Stack <Integer> sortedStack, int k) {
        //write your code here

        for (int i = 0; i < k-1; i++){
            sortedStack.pop();
        }
        System.out.println(sortedStack.peek());
    }

    public static void findKthLargestNum(Stack <Integer> sortedStack, int k) {
        int j = 1;
        while (j < k) {
            sortedStack.pop();
            j++;
        }
        System.out.println(sortedStack.peek());
    }


    public static void main(String args[]) {
        Stack < Integer > inputStack = new Stack < Integer > ();
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        for (int i = 0; i < n; i++) {
            inputStack.add( in .nextInt());
        }

        if (inputStack.isEmpty()) {
            System.out.println("stack is empty");
            System.exit(0);
        }

        int k = in .nextInt();
        if (k > inputStack.size()) {
            System.out.println("invalid input");
            System.exit(0);
        }

        // This is the temporary stack

        Stack < Integer > temp = sortStack(inputStack);
        findKthLargestNum(temp, k);

    }
}
