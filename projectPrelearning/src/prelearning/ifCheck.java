package prelearning;

import java.util.*;
public class ifCheck {

    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        if (n > 0) {
            System.out.println("The number entered is positive");
        } else if (n < 0) {
            System.out.println("The number entered is negative");
        }
    }
}