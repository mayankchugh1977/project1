package prelearning;

import java.util.Scanner;
class PrintTenthPos {
    public static void main(String[] args) {


        //Create new scanner
        Scanner input = new Scanner(System.in);

        //Values of each digit
        int tenThousands, thousands, hundreds, tens, ones;

        //Prompt user to input 5 digit number

        int number = input.nextInt();
        if (number > 99999) {
            System.out.println("\nError! Number more than 5 digits.");
        }
        else if (number < 10000) {
            System.out.println("Error! Number less than 5 digits.");
        }
        else if (10000<=number&&number<=99999){
            System.out.println(number/10000);
            number = number%10000;
            System.out.println(number/1000);
            number = number%1000;
            System.out.println(number/100);
            number = number%100;
            System.out.println(number/10);
            number = number%10;
            System.out.println(number);
        }
    }
}