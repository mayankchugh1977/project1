package algo.module.one;

import java.lang.String;
import java.util.Scanner;

public class PrintStar{
    // function to print the required pattern
    public static String func(int n) {
        if (n == 0) return "";

        // Recursive Call
        String str = '*' + func(n-1);
        System.out.println(str);

        return str;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        func(n);
    }

}
