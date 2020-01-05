package com.company;

import java.util.Scanner;
public class CoinExchangeProblem {
        public static int count(int[] d, int amount) {

            int[][] V = new int[amount + 1][d.length];
            System.out.println("amount + 1 : "+ (amount + 1) );
            System.out.println("d.length : "+ (d.length) );
            /* Write down the base 5solution*/
            /* Fill in the rest of the matrix using recursion relation */
            // if amount=0 then just return empty set to make the change
            for (int i = 1; i < d.length; i++) {
                V[0][i] = 0;
            }

            // if no coins given, 0 ways to change the amount
            for (int i = 0; i <= amount; i++) {
                V[i][0] = 1;
            }
            System.out.println("------------start- V[i][j] :--------------" );
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.println("i : "+i );
                    System.out.println("j : "+j );
                    System.out.println("V[i][j] : "+V[i][j]);
                }
            }
            System.out.println("------------end--V[i][j] :-------------" );
            // now fill rest of the matrix.

            for (int i = 1; i < d.length -1; i++) {
                for (int j = 1; j < amount -d.length; j++) {
                    // check if the coin value is less than the amount needed
                    System.out.println("------------start---------------");
                    System.out.println("i : " + i);
                    System.out.println("i - 1 : " + (i - 1));
                    System.out.println("j : " + j);
//                    System.out.println("d[i] : "+d[i]);
//                    System.out.println("d[i] : "+d[i]);
//                    System.out.println("d[i - 1] : "+d[i - 1]);
                    //System.out.println("j - d[i - 1] : "+(j - d[i - 1]));
                    //System.out.println("d[i - 1] : "+d[i - 1]);
                    //System.out.println("d[i - 1] : "+d[i - 1]);
                    //System.out.println("V[i - 1][j] : "+V[i - 1][j]);
                    //System.out.println("V[i][j - d[i - 1]] : "+V[i][j - d[i - 1]]);
                    System.out.println("--------------end-------------");
                    if ((i - 1) >= 0 && (i - 1) <= 3 ) {
                        if (d[i - 1] <= j &&
                                (i - 1) >= 0 &&
                                    (i - 1) <= 3 &&
                                        j - d[i - 1] >= 0 &&
                                            V[i][j - d[i - 1]] >= 0) {

                            V[i][j] = V[i - 1][j]
                                    + V[i][j - d[i - 1]];
                        } else {
                            // just copy the value from the top
                            V[i][j] = V[i - 1][j];
                        }
                    }
                }
            }
            return V[amount][d.length-1];
        }

        public static void main(String args[]) {
//            int[] d = {1,5,7,10};
            int[] d = { 1, 2, 3 };
            Scanner scan = new Scanner(System.in);
            int amount = scan.nextInt();
            System.out.println(count(d, amount));
            scan.close();
        }
    }