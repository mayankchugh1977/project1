package prelearning;

import java.util.*;
public class IfIncreasingOrder {

    public static void main(String[] args) {

        int n1, n2, n3;
        Scanner input = new Scanner(System.in);
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();

        if(n1 < n2 && n1 < n3){

            if (n2 < n3){
                System.out.println("The numbers entered are in increasing order");
            }else{
                System.out.print("The number are in neither in increasing order nor in decreasing order");
            }
        }else if(n1 > n2 && n1 > n3){

            if (n2 > n3){
                System.out.println("The numbers entered are in decreasing order");
            }else{
                System.out.print("The number are in neither in increasing order nor in decreasing order");
            }
        }else{
            System.out.print("The number are in neither in increasing order nor in decreasing order");
        }
    }
}
