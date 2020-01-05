package prelearning;

import java.util.Scanner;

public class DoWhileLoopTest3 {

    public static void main(String[] args) {
        int n;
        Scanner input= new Scanner(System.in);
        n=input.nextInt();
        int digitCount = 1;

        do{
            n = n/10;
            System.out.println(n);
            digitCount ++;
        }while (n/10 > 0);
        System.out.println(digitCount);
    }
}
