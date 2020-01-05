package com.company;

import java.util.Scanner;

public class MinCostProblem {

        private static int minCost(int cost[][], int m, int n)
        {
            int minCost[][]=new int[m+1][n+1];
            /* Initialise the first column of the minimum cost (table) array */
            /* Initialise the first row of the table array */
            /* Construct the rest of the table array from the recursion relation */

            // If source is same as destination
            // or destination is next to source
//            for (int i = 0; i<=m; i++)
//            {
//                for (int j = 0; j<=n; j++){
//                    System.out.println("i : "+i+"; j : "+j+"; cost[i][j] : "+cost[i][j]);
//                }
//            }


            if (m == n && m <=1 && n <= 1)
                return cost[m - 1 ][n - 1] + cost[m][n];


//            if (m+1 == n && m > 1 && n > 1)
//                return cost[m - 1 ][n] + cost[m][n];

            // Initialize min cost as direct ticket from
            // source 's' to destination 'd'.
            int min = 0;//cost[m][n];

            // Try every intermediate vertex to find minimum
            for (int i = 0; i<n; i++)
            {
                min = min + cost[0][i];
//                System.out.println("i : "+i+"; cost[0][i] : "+cost[0][i]);
//                System.out.println("min : "+min);

            }

            // Try every intermediate vertex to find minimum
            for (int j = 1; j<=m; j++)
            {
                min = min + cost[j][n];
//                System.out.println("j : "+j+"; cost[j][n] : "+cost[j][n]);
//                System.out.println("min : "+min);

            }

            if (m > 1 && n > 1)
                minCost[m][n] = min;

            return minCost[m][n];
        }

        public static void main(String args[])
        {
            int cost[][]= {{1, 2, 3},
                    {4, 8, 2},
                    {1, 5, 3}};
            Scanner scan = new Scanner(System.in);
            int xCoordinate = scan.nextInt();
            int yCoordinate = scan.nextInt();
            System.out.println(minCost(cost,xCoordinate,yCoordinate));
        }
    }

