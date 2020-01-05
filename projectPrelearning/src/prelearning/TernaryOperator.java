package prelearning;

import java.util.Scanner;

public class TernaryOperator {

    public static void main(String args[]) {

        int X,Y,A,B,heartRate;
        Scanner input= new Scanner(System.in);
        X=input.nextInt();
        Y=input.nextInt();
        A=input.nextInt();
        B=input.nextInt();
        heartRate=input.nextInt();

        String result;

        if (X+Y>30){
            result="truth";
        }
        else if (A>3 || B<6){

            result="truth";
        }
        else if (heartRate==70 && X>3){
            result="truth";
        }
        else {
            result="lie";
        }

        System.out.println("The statement said by the person is result "+result);

        String result2;


        result2 = ((X+Y)>30) ? "truth" : ( (A>3 || B<6) ? "truth" : ((heartRate==70 && X>3) ? "truth" : "lie")) ;

        System.out.println("The statement said by the person is result2 "+result2);

        result= (X+Y>30)?"truth":"lie";
        result= (A>3 || B<6)?"truth":"lie";
        result=(heartRate==70 && X>3)?"truth":"lie";
    }
}
