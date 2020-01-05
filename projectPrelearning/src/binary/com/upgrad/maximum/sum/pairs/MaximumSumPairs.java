package binary.com.upgrad.maximum.sum.pairs;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MaximumSumPairs {

    public static void main(String args[]) {
        //below two ArrayList are used to store the given input
        ArrayList<Integer> ArrayL1 = new ArrayList<Integer>();
        ArrayList<Integer> ArrayL2 = new ArrayList<Integer>();

        Scanner in = new Scanner(System.in);
        int n, i;

        // size of ArrayL1 = size of ArrayL2 = n
        n = in.nextInt();

        for (i = 0; i < n; i++) {
            ArrayL1.add(in.nextInt());
        }
        for (i = 0; i < n; i++) {
            ArrayL2.add(in.nextInt());
        }

        //write your code here

        PriorityQueue<Integer> pq  = new PriorityQueue<Integer>();

        int arrAElement = 0;
        int arrBElement = 0;
        for (i = 0; i < ArrayL1.size() ; i++) {
            arrAElement = ArrayL1.get(i);
            for (int j  = 0; j < ArrayL2.size() ; j++) {
                arrBElement = ArrayL2.get(j);
                pq.add(arrAElement + arrBElement);
            }
        }

//        System.out.println(pq);

        ArrayList<Integer> ArrayL3 = new ArrayList<Integer>();
        for (i = pq.size() ; i > 0  ; i--) {
            if(pq.size() <= 3){
//                System.out.println("add"+ pq.peek());
                ArrayL3.add(pq.poll());

            }else{
                pq.poll();
            }
        }

        int arrCElement = 0;
        for (i = ArrayL3.size() - 1; i >= 0 ; i--) {
            System.out.println(ArrayL3.get(i));
        }

    }
}
