package com.upgrad.queue;


import java.util.*;

class PalindromStringReduceComplexsity {

    public static void main(String[] args) {
        PalindromeCheck obj = new PalindromeCheck();
        Scanner in = new Scanner(System.in);
        String input = in .nextLine();

        StringBuilder sb = new StringBuilder( );
        sb.append(input);
        StringBuilder reverseString = new StringBuilder( );
        reverseString=sb.reverse();
        if(reverseString==sb) System.out.println( "The input string is palindrome");
        else  System.out.println( "The input string is not a palindrome");

    }
}

