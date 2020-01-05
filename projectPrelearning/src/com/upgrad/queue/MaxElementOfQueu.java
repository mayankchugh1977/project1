package com.upgrad.queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class MaxElementOfQueu{
    static Queue<Integer> q = new LinkedList<Integer>();

    public static void func() {


        //write your code here
        Queue<Integer> q2nd = new LinkedList<Integer>();
        int max= q.peek();   // initialize max with head of queue

        while (!q.isEmpty()){
            if(q.peek().compareTo(max) > 0){
                max = q.peek();
            }
            q2nd.add(q.peek());
            q.remove();
        }

        while (!q2nd.isEmpty()){
            if(!(q2nd.peek().compareTo(max) == 0)){
                q.add(q2nd.peek());
            }
            q2nd.remove();
        }


        q.addAll(q2nd);
        q.add(max);
//        System.out.println(max);


    }

    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int j = 0; j < n; j++) {
            q.add(in.nextInt());
        }
        func();
        System.out.println(q);
    }
}
