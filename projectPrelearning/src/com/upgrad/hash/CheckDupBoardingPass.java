package com.upgrad.hash;

import java.util.*;
        import java.util.Scanner;

class CheckDupBoardingPass {
    public static void main(String[] args)
    {
        Hashtable<Integer,String> boardingPass= new Hashtable<Integer,String>();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        //upgrad solution
        for(int i:arr)
        {
            if(boardingPass.containsKey(i))
                System.out.println(i);
            else
                boardingPass.put(i,"Checked");
        }

        // My solution
        for(int i:arr)
        {
            //Check whether the pass already exists in the hash table or not. If it doesn’t, add it to the table; otherwise, print the duplicate pass number.
            if(boardingPass !=null && boardingPass.get(i) != null && boardingPass.get(i).equalsIgnoreCase(Integer.toString(i))){
                System.out.println(i);
            }else {
                boardingPass.put(i,Integer.toString(i));
            }

        }
    }
}
