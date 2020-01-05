package com.upgrad.stack;

import java.util.Scanner;
import java.util.Stack;

public class PracticeTestSubsequenceCheck1 {

    public static Boolean contains(Stack<Integer> sequence1, Stack<Integer> sequence2) {
        // This block will be filled by the student

        // Base Cases
        if (sequence1.size() == 0)
            return true;
        if (sequence2.size() == 0)
            return false;

        // If last characters of two strings are matching
        if (sequence1.peek().equals(sequence2.peek())) {
            sequence1.pop();
            sequence2.pop();
            return contains(sequence1, sequence2);
        }else {
            sequence2.pop();
            return contains(sequence1, sequence2);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        Stack<Integer> sequence1 = new Stack<Integer>();
        Stack<Integer> sequence2 = new Stack<Integer>();
        int boxIndex = 0;
        for (String elem1 : line1.split(" ")) {
            sequence1.add(Integer.parseInt(elem1));
        }
        for (String elem2 : line2.split(" ")) {
            sequence2.add(Integer.parseInt(elem2));
        }
        Boolean isSubsequence = contains(sequence1, sequence2);
        System.out.println(isSubsequence);
    }
}
