package com.upgrad.stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack{
    public static void main(String arg[]) {
        Stack<Character> s = new Stack<Character>();
        Scanner in = new Scanner(System.in);
        String data = in.nextLine();
        //write your code here
        //My Solution starts here
        for(int k=0;k<data.length();k++) {
            s.push(data.charAt(k));
        }

        for(int k=0;k<data.length();k++) {
            System.out.print(s.pop());
        }
        //My Solution Ends here

        //Ugrad Solution starts here
        String ans = "";
        for (char element : data.toCharArray()) {
            s.push(element);
        }
        for (char element : data.toCharArray()) {
            ans += s.pop();
        }
        System.out.print(ans);
        //Ugrad Solution ends here

    }
}
