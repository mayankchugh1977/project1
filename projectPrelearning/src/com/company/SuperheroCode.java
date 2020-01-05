package com.company;

import java.util.Scanner;

class SuperheroCode {
    public static int minJump(int n) {
        int f[] = new int[n + 1];
        /* Declare an array to store the minimum jumps. */
        /* Initialise the base condition */
        /* Fill in the array to find Minimum Jumps from a certain distance */
        return f[n];
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int distance = scan.nextInt();
        if (distance > 0) {
            System.out.println(minJump(distance));
        } else {
            System.out.println("Distance should be a positive integer");
        }

    }
}

