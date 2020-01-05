package prelearning;

import java.util.*;
public class tempurature1 {

    /*public static void main(String[] args) {
        int C = 1;
        int F = 9 * C / 5 + 32;
        System.out.println(F);
    }*/

    public static void main(String[] args) {
       /* float C = 1;
        float F =  0;//(float) (9 * C / 5 + 32);

        F = (float) (9 * C / 5 + 32);
        System.out.println(F);*/

        float C , F;
        Scanner input= new Scanner(System.in);
        C=input.nextInt();
        F=9*C/5+32;
        System.out.println(F);
    }
}
