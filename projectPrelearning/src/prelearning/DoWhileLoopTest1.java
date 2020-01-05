package prelearning;

import java.util.Scanner;

public class DoWhileLoopTest1 {


    public static void main(String[] args) {
        int n;
        Scanner input= new Scanner(System.in);
        n=input.nextInt();
        int counter=n;
        do{

            System.out.println(counter--);

        }while (counter>=0);
    }
}

