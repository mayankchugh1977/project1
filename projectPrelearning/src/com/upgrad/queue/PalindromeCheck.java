package com.upgrad.queue;


  import java.util.*;
class PalindromeCheck {

    public void checkPalindrome(String input) {

        Stack<Character> stack = new Stack<>();
        //Write your code here

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        String reverseString = "";

        while ( !stack.isEmpty()) {
            reverseString = reverseString+stack.pop();
        }

        if ( input.equals(reverseString))
        System.out.println("The given input is a palindrome.");
        else
        System.out.println("The given input is not a palindrome.");
    }
    public static void main(String[] args) {
        PalindromeCheck obj = new PalindromeCheck();
        Scanner in = new Scanner(System.in);
        String inputString = in .nextLine();
        obj.checkPalindrome(inputString);

    }
}

