package prelearning;

import java.util.Scanner;
class PracticeTest6 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        // Enter annual income
        double income = scan.nextDouble();
        // Enter age
        int age = scan.nextInt();

        double tax = 0.0;

       /* if(income <= 250000) {
            tax = 0;
        }else */
       if (income > 250000 && income <= 300000){
           if(age < 60){
               tax = 0.10 * (300000- 250000);
           }
        }else if (income > 300000 && income <= 500000){
            if(age < 80){
                tax = 0.10 * (300000- 250000);
            }
        }else if (income > 500000 && income <= 1000000){
           tax = 0.10 * (500000- 250000) + 0.2 * (income - 500000);
        }else if (income > 1000000){
           tax = 0.10 * (500000- 250000) + 0.2 * (1000000 - 500000) + 0.3 * (income - 500000) ;
        }

        System.out.print(tax);
        scan.close();
    }
}