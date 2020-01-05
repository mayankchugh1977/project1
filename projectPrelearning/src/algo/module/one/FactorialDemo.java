package algo.module.one;

import java.util.Scanner;

public class FactorialDemo {
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive no: ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is : " + factorial(n));
    }
}