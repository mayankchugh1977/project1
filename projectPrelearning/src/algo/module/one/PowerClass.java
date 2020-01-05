package algo.module.one;

import java.util.Scanner;

public class PowerClass {
    // function to calculate base^exponent
    public static int powerfunc(int base, int power) {
        if (power == 0)
            return 1;
        return base * powerfunc(base, power - 1);

    }
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        int a = inpt.nextInt();
        int b = inpt.nextInt();
        // printing the value of a^b i.e.,
        System.out.printf("%d", powerfunc(a, b));
    }

}
