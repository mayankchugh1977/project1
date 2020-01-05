package com.upgrad.stack;

import java.util.*;

public class StackPrint5thElement {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        printFifthElementFromEnd(stack);
    }

    // Method to print the fifth element from the bottom of the stack
    static void printFifthElementFromStartStack(Stack<Integer> stack) {
        int n = stack.size();
        // If the stack doesn't have enough elements
        if (n < 5)
            System.out.println("There are not enough elements in the stack");
        else {
            while (stack.size() > 5){
                stack.pop();
            }
            System.out.println(stack.peek());
        }
    }

    // Method to print the fifth element from the top of the stack
    static void printFifthElementFromEndStack(Stack<Integer> stack) {
        int n = stack.size();
        // If the stack doesn't have enough elements
        if (n < 5)
            System.out.println("There are not enough elements in the stack");
        else {
            for (int i = 0; i < 4; i++){
                stack.pop();
            }
            System.out.println(stack.peek());
        }
    }

    // Method to print the fifth element from the top of the stack
    static void printFifthElementFromEnd(Stack<Integer> stack) {
        // Write your code here

        if (stack.size() < 5 )
        {
            System.out.println("There are not enough elements in the stack");
            System.exit(0);
        }

        int n = 0 ;
        for(int i = stack.size(); i >= 0; i--){

           if (n == 5) {
                System.out.println(stack.get(i));
                System.exit(0);
            } else {
                n++;
            }
        }
    }

    // Method to print the fifth element from the bottom of the stack
    static void printFifthElementFromStart(Stack<Integer> stack) {
        // Write your code here
        if (stack.size() < 5 )
        {
            System.out.println("There are not enough elements in the stack");
            System.exit(0);
        }

        int n = 0 ;
        for(int i = 0; i < stack.size(); i++){

            if (n == 4) {
                System.out.println(stack.get(i));
                System.exit(0);
            } else {
                n++;
            }
        }
    }


}