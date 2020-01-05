package prelearning;

import java.util.*;
public class IfEvenOddCheck {

    public static void main(String[] args) {

        int n;
        Scanner input= new Scanner(System.in);
        n=input.nextInt();
        if (n%2 == 0){
            System.out.println("The number entered is even");
        }else  if (n%2 != 0){
            System.out.println("The number entered is odd");
        }
    }
}