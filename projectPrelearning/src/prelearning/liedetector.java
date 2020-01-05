package prelearning;

import java.util.*;
public class liedetector {

    public static void main(String[] args) {

        int X;
        int Y;


        Scanner input= new Scanner(System.in);

       X = input.nextInt();

       Y = input.nextInt();

        boolean test;
        test=(X+Y)>30;
        System.out.println("The statement said by the person is "+test);

    }
}