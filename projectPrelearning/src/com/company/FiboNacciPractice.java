package com.company;

import java.util.Scanner;
class FiboNacciPractice {
    static int fib(int n) {
        /* Declare an array to store Fibonacci numbers */
        /* Assign the 0th, 1st, and 2nd numbers of the Fibonacci series to 0, 1, and 2 respectively */
        /* Add the previous three numbers in the series, and store them */
        /* Return the nth element in the series */
        if(n == 1 ){
            return 0;
        }
        if(n == 2 ){
            return 1;
        }
        if(n == 3 ){
            return 2;
        }
        int fibo1=0, fibo2=1, fibo3=2, fibonacci=1;
        for(int i = 4; i<= n; i++){

            //Fibonacci number is sum of previous two Fibonacci number
            fibonacci = fibo1 + fibo2 + fibo3;
            fibo1 = fibo2;
            fibo2 = fibo3;
            fibo3 = fibonacci;
        }
        return fibonacci; //Fibonacci number
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        // Enter the number n
        int n = scan.nextInt();
        System.out.println(fib(n));
        scan.close();
    }
}