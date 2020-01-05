package prelearning;

import java.util.Scanner;

public class WhileLoopTest4 {

    public static void main(String[] args) {
        int n;
        Scanner input= new Scanner(System.in);
        n=input.nextInt();
        int counter=0;
        while( n > counter) {
            System.out.println (++counter);
        }
    }
}
