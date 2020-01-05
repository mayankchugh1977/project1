package prelearning;

import java.util.*;
public class ForLootTest5 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int n=input.nextInt();

        int sum = 0 ;
        int avg = 0 ;

        for(int i = 0 ; i < n ; i++){
            sum = sum + input.nextInt();
        }

        avg = sum/n;
        System.out.println(avg);
    }
}