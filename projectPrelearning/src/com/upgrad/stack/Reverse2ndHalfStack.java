package com.upgrad.stack;

import java.util.*;

public class Reverse2ndHalfStack {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        reverseSecondHalf(stack);
    }

    // Method to reverse the last half of the elements from the bottom of the stack
    static void reverseSecondHalf(Stack<Integer> stack) {
        // Write your code here

        Stack<Integer> finalStack = new Stack<>();

        Stack<Integer> stackfromMid = new Stack<>();
        int n = stack.size()/2;

        for (int i = 0; i < n; i++){
            stackfromMid.push(stack.peek());
            stack.pop();
        }

        int sizeStack = stackfromMid.size();

        for (int i = 0; i < sizeStack; i++){
            finalStack.push(stackfromMid.peek());
            stackfromMid.pop();
        }

        int remainStack = stack.size();

        for (int i = 0; i < remainStack; i++){
            finalStack.push(stack.peek());
            stack.pop();
        }


        int completeStacSize = finalStack.size();
        System.out.print("[");
        for (int i = 0; i < completeStacSize; i++){
            if (i == completeStacSize - 1 ){
                System.out.print(finalStack.peek());
            }else {
                System.out.print(finalStack.peek() + ", ");
            }
            finalStack.pop();
        }
        System.out.print("]");
    }
}