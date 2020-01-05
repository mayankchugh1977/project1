package algo.module.one;


import java.util.Scanner;

class ReverseDigits {
    public static boolean palindrome(int[] num, int index) {
        // base case
        // palindrome or not.
        if (index < 1) {
            return palindrome(num, index + 1);
        }

    return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        for(int i=0; i< 5;i++)
            num[i]=sc.nextInt();
        boolean answer =palindrome(num, 0);
        System.out.println(answer);
    }
}
