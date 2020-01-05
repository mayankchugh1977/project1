package prelearning;

import java.util.Scanner;

class AgeCheckGotTicket {
    public static void main(String[] args) {
        int myAge;
        int ageOfBrother;

        Scanner input = new Scanner(System.in);
        myAge = input.nextInt();
        ageOfBrother = input.nextInt();
        if(myAge < 25 && ageOfBrother < 25){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}