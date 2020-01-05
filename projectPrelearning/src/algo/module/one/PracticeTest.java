package algo.module.one;

import java.util.Scanner;

public class PracticeTest {

    public static void main(String args[]) {

        System.out.println( func(3,3));

        System.out.println( func2(12));
    }

    public static int func(int x, int n) {
        if (n == 0)
            return 1;
        else if(n%2 == 0)
            return func(x*x, n/2);
        else
            return x*func(x*x, n/2);
    }

    public static int func2(int n) {
        if (n == 1)
            return 0;
        else
            return 1 + func2(n/2);
    }
}
