package prelearning;

import java.util.Scanner;

class WhilePractice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Enter the number
        int number = scan.nextInt();
        int result = 1;
        int i = 1;
        if(number >= 2) {

            while ((int) Math.pow(2, i) <= number) {
                result =(int) Math.pow(2, i);
                i++;
            }

            System.out.print(result);

        } else {
            System.out.print("Please enter an integer >= 2");
        }
        scan.close();
    }
}
