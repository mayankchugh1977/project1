package com.upgrad.queue;

import java.util.Stack;

public class StackBalanceParenthesis {


    public static boolean checkBalanced(String inputString){
        Stack< Integer > inputStack = new Stack < Integer > ();
        Stack<Character> newStack=new Stack<>();
        for(int i=0;i<inputString.length();i++) {
            if (inputString.charAt(i) == '(') {
                newStack.push(inputString.charAt(i));
            }
            if (inputString.charAt(i) == ')') {
                if (newStack.isEmpty()) {
                    return false;
                } else {
                    newStack.pop();
                }
            }
        }
        if(newStack.isEmpty())
            return true;
        else
            return false;
    }
}