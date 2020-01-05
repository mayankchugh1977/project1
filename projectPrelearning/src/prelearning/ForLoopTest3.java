package prelearning;

import java.util.Scanner;

class ForLoopTest3 {
    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);
        //Enter the number upto which you wish to find the sum, in the input console
        int number = scan.nextInt();
        int sum = 0;

        for ( int i = 0 ; i <= number; i++ ) {
            sum = sum + i;

        }

        System.out.print(sum);
    }
}
