package com.upgrad.stack;

import java.util.*;

public class DeleteStack {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        deleteFirstHalf(stack);
    }

    // Method to delete the first half of the elements from the bottom of the stackand print the remaining elements
    static void deleteFirstHalf(Stack<Integer> stack) {
        // Write your code here

        Stack<Integer> stackfromMid = new Stack<>();
        int n = stack.size()/2;
        // If the stack doesn't have enough elements
       /* if (n < 5)
            System.out.println("There are not enough elements in the stack");
        else {*/
            for (int i = 0; i < n; i++){
               // System.out.println(stack.peek());
                stackfromMid.push(stack.peek());
                stack.pop();
            }
        System.out.print("[");
            int sizeStack = stackfromMid.size();
        for (int i = 0; i < sizeStack; i++){
            if (i == sizeStack - 1 ){
                System.out.print(stackfromMid.peek());
            }else {
                System.out.print(stackfromMid.peek() + ", ");
            }
                stackfromMid.pop();
        }
        System.out.print("]");

//        }
    }
}